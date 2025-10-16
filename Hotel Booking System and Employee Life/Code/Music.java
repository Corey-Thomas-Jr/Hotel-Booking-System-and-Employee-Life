import java.awt.Dimension;
import java.io.File;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.swing.JSlider;

public class Music {

    // single shared instance you can use anywhere
        public static final Music AUDIO = new Music();

    // grabs the audio clip and prepares it to play
        private Clip clip;

    // play (or switch) a track; will close the old clip if one exists 
        public void play(String path) {
            stop(); // close previous clip if any
            try {
                File file = new File(path);
                if (!file.exists()) {
                    System.out.println("File not found: " + file.getAbsolutePath());
                    return;
                }

        // Load stream
            AudioInputStream in = AudioSystem.getAudioInputStream(file);

        // Ensure PCM_SIGNED (some WAVs are compressed; Clip needs PCM)
            AudioFormat base = in.getFormat();
            AudioFormat decoded = new AudioFormat(
                    AudioFormat.Encoding.PCM_SIGNED,
                    base.getSampleRate(),
                    16,
                    base.getChannels(),
                    base.getChannels() * 2,
                    base.getSampleRate(),
                    false
            );

        // decode stream
            AudioInputStream din = AudioSystem.getAudioInputStream(decoded, in);

        // Open clip
            clip = AudioSystem.getClip();
            clip.open(din);

        // optional: set a comfortable default volume (60%)
            setVolumePercent(0.60f);

        //  Start + loop
            clip.start();
            clip.loop(Clip.LOOP_CONTINUOUSLY);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void stop() {
        if (clip != null) {
            try {
                clip.stop();
                clip.close();
            } catch (Exception ignore) {}
            clip = null;
        }
    }

    // 0.0f (mute) … 1.0f (max). Safely no-ops if control not supported.
        public void setVolumePercent(float p) {
            if (clip == null) return;
            if (!clip.isControlSupported(FloatControl.Type.MASTER_GAIN)) return;

            FloatControl gain = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
            float min = gain.getMinimum();  // typically around -80.0
            float max = gain.getMaximum();  // typically around +6.0
            
            // map [0,1] → [min,max]
            float value = Math.min(1f, Math.max(0f, p));
            float gainValue = (max - min) * value + min;
            gain.setValue(gainValue);
        }

    // Create a small horizontal slider to control volume.
        public JSlider createSmallVolumeSlider(int widthPx) {
            JSlider slider = new JSlider(0, 100, 60);
            slider.setFocusable(false);
            slider.setPaintTicks(false);
            slider.setPaintLabels(false);
            slider.setOpaque(false);
            slider.setPreferredSize(new Dimension(widthPx, 18));
            slider.setMaximumSize(new Dimension(widthPx, 18));
            slider.addChangeListener(e -> setVolumePercent(slider.getValue() / 100f));
            return slider;
            }
}
