import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Tik_Tac_Toe_Keep_Running {
    Tik_Tac_Toe_Keep_Running(){
         // Starting Window Frame
            JFrame frame = new JFrame("Tik Tac Toe Window");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 800);
            JPanel panel = new JPanel();
            panel.setLayout(null);
            panel.setBackground(Color.decode("#1e1e1e"));

        // JLabels
            // Welcome
                JLabel Welcome = new JLabel("Welcome");
                Welcome.setBounds(300, 8, 336, 23);
                Welcome.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 25));
                Welcome.setForeground(Color.decode("#D9D9D9"));
                panel.add(Welcome);

            // To
                JLabel To = new JLabel("To");
                To.setBounds(335, 30, 243, 57);
                To.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 25));
                To.setForeground(Color.decode("#D9D9D9"));
                panel.add(To);

            // Tic Tak Toe
                JLabel Tic_Tak_Toe = new JLabel("Tic Tak Toe");
                Tic_Tak_Toe.setBounds(290, 70, 243, 57);
                Tic_Tak_Toe.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 25));
                Tic_Tak_Toe.setForeground(Color.decode("#D9D9D9"));
                panel.add(Tic_Tak_Toe);

            // ^_^
                JLabel face = new JLabel("^_^");
                face.setBounds(335, 105, 243, 57);
                face.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 25));
                face.setForeground(Color.decode("#D9D9D9"));
                panel.add(face);

        // Jbuttons
            // Play
                JButton Play_Button = new JButton("Play");
                Play_Button.setBounds(260, 200, 200, 50);
                Play_Button.setBackground(Color.decode("#2e2e2e"));
                Play_Button.setForeground(Color.decode("#D9D9D9"));
                Play_Button.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
                Play_Button.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
                Play_Button.setFocusPainted(false);
                panel.add(Play_Button);


            // Options
                JButton Options_Button = new JButton("Options");
                Options_Button.setBounds(260, 300, 200, 50);
                Options_Button.setBackground(Color.decode("#2e2e2e"));
                Options_Button.setForeground(Color.decode("#D9D9D9"));
                Options_Button.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
                Options_Button.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
                Options_Button.setFocusPainted(false);
                panel.add(Options_Button); 
            
            
            // Quit
                JButton Quit_Button = new JButton("Quit");
                Quit_Button.setBounds(260, 400, 200, 50);
                Quit_Button.setBackground(Color.decode("#2e2e2e"));
                Quit_Button.setForeground(Color.decode("#D9D9D9"));
                Quit_Button.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
                Quit_Button.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
                Quit_Button.setFocusPainted(false);
                panel.add(Quit_Button);

                // Play button trigger
                    Play_Button.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            frame.dispose();
                            if (e.getSource() == Play_Button) {
                                P_P P_O = new P_P();
                            }
                        }
                    });

                // Options button trigger
                    Options_Button.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            frame.dispose();
                            if (e.getSource() == Options_Button) {
                                Tic_Tac_Toe_Options O = new Tic_Tac_Toe_Options();
                            }
                        }
                    });

                // Button to Quit Program and go back to Arcade trigger
                        Quit_Button.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                frame.dispose();
                                if (e.getSource() == Quit_Button) {
                                    Arcade_GUI arcade = new Arcade_GUI();
                                    Music.AUDIO.stop();
                                }
                            }
                        });

        frame.add(panel);
        frame.setVisible(true);
    }
}
