import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;

public class Tic_Tac_Toe_Options{
    Tic_Tac_Toe_Options(){
        JFrame frame = new JFrame("Options Window");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.decode("#1e1e1e"));

         // JLabels
            // Welcome to the Options Section
                JLabel Options = new JLabel("Welcome to the Options Section");
                Options.setBounds(120, 50, 506, 53);
                Options.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 35));
                Options.setForeground(Color.decode("#D9D9D9"));
                panel.add(Options);

            // Music Volume:
                JLabel a = new JLabel("Music Volume: ");
                a.setBounds(200, 200, 506, 23);
                a.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 20));
                a.setForeground(Color.decode("#D9D9D9"));
                panel.add(a);

            // Music Volume Slider:
                JSlider slider = Music.AUDIO.createSmallVolumeSlider(150);
                slider.setBounds(330, 200, 150, 23);
                panel.add(slider);

        // JButtons
            // Play
                JButton Play_Button = new JButton("Play");
                Play_Button.setBounds(580, 650, 200, 50);
                Play_Button.setBackground(Color.decode("#2e2e2e"));
                Play_Button.setForeground(Color.decode("#D9D9D9"));
                Play_Button.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
                Play_Button.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
                Play_Button.setFocusPainted(false);
                panel.add(Play_Button);
                
        // Go Back back to main menu button trigger
            JButton Main_menu = new JButton("Main Menu");
            Main_menu.setBounds(580, 710, 200, 50);
            Main_menu.setBackground(Color.decode("#2e2e2e"));
            Main_menu.setForeground(Color.decode("#D9D9D9"));
            Main_menu.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
            Main_menu.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
            Main_menu.setFocusPainted(false);
            panel.add(Main_menu);

        // Play button trigger
            Play_Button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    frame.dispose();
                    if (e.getSource() == Play_Button) {
                        P_P P_P = new P_P();
                    }
                }
            });

        // Main Menu trigger
            Main_menu.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    frame.dispose();
                    if (e.getSource() == Main_menu) {
                        Tik_Tac_Toe_Keep_Running K_R = new Tik_Tac_Toe_Keep_Running();
                    }
                }
            });

        frame.add(panel);
        frame.setVisible(true);
    }
}
