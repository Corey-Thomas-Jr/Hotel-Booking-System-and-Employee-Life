import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Food_GUI {
    Food_GUI(){
        // Window Frame
            JFrame frame = new JFrame("Food Options window");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 800);
            JPanel panel = new JPanel();
            panel.setLayout(null);
            panel.setBackground(Color.decode("#1e1e1e"));

        // Welcome to the Food section
            JLabel Food = new JLabel("Pick a fast-food or restaurant to visit");
            Food.setBounds(150, 30, 500, 50);
            Food.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 30));
            Food.setForeground(Color.decode("#D9D9D9"));
            panel.add(Food);

        // JButtions
            // Ruth's Chris Steak House
                JButton Ruths_Button = new JButton("Ruth's Chris Steak House");
                Ruths_Button.setBounds(100, 150, 200, 50);
                Ruths_Button.setBackground(Color.decode("#2e2e2e"));
                Ruths_Button.setForeground(Color.decode("#D9D9D9"));
                Ruths_Button.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
                Ruths_Button.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
                Ruths_Button.setFocusPainted(false);
                panel.add(Ruths_Button);

            // Freddy's Frozen Custard and Steakburgers
                JButton Freddys_Button = new JButton("Freddy's Frozen Custard and Steakburgers");
                Freddys_Button.setBounds(350, 150, 300, 50);
                Freddys_Button.setBackground(Color.decode("#2e2e2e"));
                Freddys_Button.setForeground(Color.decode("#D9D9D9"));
                Freddys_Button.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
                Freddys_Button.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
                Freddys_Button.setFocusPainted(false);
                panel.add(Freddys_Button);

            // Juicy Crab
                JButton Juicy_Crab_Button = new JButton("Juicy Crab");
                Juicy_Crab_Button.setBounds(225, 250, 200, 50);
                Juicy_Crab_Button.setBackground(Color.decode("#2e2e2e"));
                Juicy_Crab_Button.setForeground(Color.decode("#D9D9D9"));
                Juicy_Crab_Button.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
                Juicy_Crab_Button.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
                Juicy_Crab_Button.setFocusPainted(false);
                panel.add(Juicy_Crab_Button);

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
