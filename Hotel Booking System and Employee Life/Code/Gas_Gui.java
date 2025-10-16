import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Gas_Gui {
    Gas_Gui(){
        // Window Frame
            JFrame frame = new JFrame("Gas Options window");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 800);
            JPanel panel = new JPanel();
            panel.setLayout(null);
            panel.setBackground(Color.decode("#1e1e1e"));

        // Welcome to the Gas section
            JLabel Gas = new JLabel("Pick a gas station to visit");
            Gas.setBounds(150, 30, 500, 50);
            Gas.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 30));
            Gas.setForeground(Color.decode("#D9D9D9"));
            panel.add(Gas);

        // JButtions
            // Shell
                JButton Shell_Button = new JButton("Shell");
                Shell_Button.setBounds(100, 150, 200, 50);
                Shell_Button.setBackground(Color.decode("#2e2e2e"));
                Shell_Button.setForeground(Color.decode("#D9D9D9"));
                Shell_Button.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
                Shell_Button.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
                Shell_Button.setFocusPainted(false);
                panel.add(Shell_Button);

            // Chevron
                JButton Lobby_Flor_Button = new JButton("Chevron");
                Lobby_Flor_Button.setBounds(350, 150, 200, 50);
                Lobby_Flor_Button.setBackground(Color.decode("#2e2e2e"));
                Lobby_Flor_Button.setForeground(Color.decode("#D9D9D9"));
                Lobby_Flor_Button.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
                Lobby_Flor_Button.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
                Lobby_Flor_Button.setFocusPainted(false);
                panel.add(Lobby_Flor_Button);

            // Go Back
                JButton Go_Back_Button = new JButton("Go back");
                Go_Back_Button.setBounds(580, 710, 200, 50);
                Go_Back_Button.setBackground(Color.decode("#2e2e2e"));
                Go_Back_Button.setForeground(Color.decode("#D9D9D9"));
                Go_Back_Button.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
                Go_Back_Button.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
                Go_Back_Button.setFocusPainted(false);
                panel.add(Go_Back_Button);

                
            // Go Back trigger
                Go_Back_Button.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        frame.dispose();
                        if (e.getSource() == Go_Back_Button) {
                            Off_Work_GUI off_Work = new Off_Work_GUI();
                        }
                    }
                });

        frame.add(panel);
        frame.setVisible(true);
    }
}
