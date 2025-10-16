import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Gym_GUI {
    Gym_GUI(){
        // Window Frame
            JFrame frame = new JFrame("Gym Options window");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 800);
            JPanel panel = new JPanel();
            panel.setLayout(null);
            panel.setBackground(Color.decode("#1e1e1e"));

        // Welcome to the Gym section
            JLabel element4 = new JLabel("Pick a Gym to visit");
            element4.setBounds(150, 30, 500, 50);
            element4.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 30));
            element4.setForeground(Color.decode("#D9D9D9"));
            panel.add(element4);

        // JButtions
            // Crunch
                JButton Crunchl_Button = new JButton("Crunch");
                Crunchl_Button.setBounds(100, 150, 200, 50);
                Crunchl_Button.setBackground(Color.decode("#2e2e2e"));
                Crunchl_Button.setForeground(Color.decode("#D9D9D9"));
                Crunchl_Button.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
                Crunchl_Button.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
                Crunchl_Button.setFocusPainted(false);
                panel.add(Crunchl_Button);

            // La Fitness
                JButton Lafitness_Button = new JButton("La Fitness");
                Lafitness_Button.setBounds(350, 150, 200, 50);
                Lafitness_Button.setBackground(Color.decode("#2e2e2e"));
                Lafitness_Button.setForeground(Color.decode("#D9D9D9"));
                Lafitness_Button.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
                Lafitness_Button.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
                Lafitness_Button.setFocusPainted(false);
                panel.add(Lafitness_Button);

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
