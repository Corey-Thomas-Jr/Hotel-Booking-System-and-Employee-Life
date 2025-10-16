import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Off_Work_GUI {
    Off_Work_GUI(){
        // Window Frame
            JFrame frame = new JFrame("Off-Work/Life Simulation window");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 800);
            JPanel panel = new JPanel();
            panel.setLayout(null);
            panel.setBackground(Color.decode("#1e1e1e"));

        // JLabels
            // Welcome to the off-work section
                JLabel off_work = new JLabel("Welcome to the off-work section!!");
                off_work.setBounds(150, 30, 500, 50);
                off_work.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 30));
                off_work.setForeground(Color.decode("#D9D9D9"));
                panel.add(off_work);

        // Jbuttons
             // Gas
                JButton Gas_Button = new JButton("Gas");
                Gas_Button.setBounds(100, 150, 200, 50);
                Gas_Button.setBackground(Color.decode("#2e2e2e"));
                Gas_Button.setForeground(Color.decode("#D9D9D9"));
                Gas_Button.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
                Gas_Button.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
                Gas_Button.setFocusPainted(false);
                panel.add(Gas_Button);

            // Food
                JButton food_Button = new JButton("Food");
                food_Button.setBounds(350, 150, 200, 50);
                food_Button.setBackground(Color.decode("#2e2e2e"));
                food_Button.setForeground(Color.decode("#D9D9D9"));
                food_Button.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
                food_Button.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
                food_Button.setFocusPainted(false);
                panel.add(food_Button);

            // Arcade
                JButton Arcade_Button = new JButton("Arcade");
                Arcade_Button.setBounds(100, 250, 200, 50);
                Arcade_Button.setBackground(Color.decode("#2e2e2e"));
                Arcade_Button.setForeground(Color.decode("#D9D9D9"));
                Arcade_Button.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
                Arcade_Button.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
                Arcade_Button.setFocusPainted(false);
                panel.add(Arcade_Button);

            // Gym
                JButton Gym_Button = new JButton("Gym");
                Gym_Button.setBounds(350, 250, 200, 50);
                Gym_Button.setBackground(Color.decode("#2e2e2e"));
                Gym_Button.setForeground(Color.decode("#D9D9D9"));
                Gym_Button.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
                Gym_Button.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
                Gym_Button.setFocusPainted(false);
                panel.add(Gym_Button);

            // Go home and Sleep
                JButton Home_Sleep_Button = new JButton("Go home and sleep");
                Home_Sleep_Button.setBounds(580, 590, 200, 50);
                Home_Sleep_Button.setBackground(Color.decode("#2e2e2e"));
                Home_Sleep_Button.setForeground(Color.decode("#D9D9D9"));
                Home_Sleep_Button.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
                Home_Sleep_Button.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
                Home_Sleep_Button.setFocusPainted(false);
                panel.add(Home_Sleep_Button);

            // Work
                JButton Work_Button = new JButton("Go to Work");
                Work_Button.setBounds(580, 650, 200, 50);
                Work_Button.setBackground(Color.decode("#2e2e2e"));
                Work_Button.setForeground(Color.decode("#D9D9D9"));
                Work_Button.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
                Work_Button.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
                Work_Button.setFocusPainted(false);
                panel.add(Work_Button);

            // Exit Program
                JButton Exit_Program_Button = new JButton("Exit Program");
                Exit_Program_Button.setBounds(580, 710, 200, 50);
                Exit_Program_Button.setBackground(Color.decode("#2e2e2e"));
                Exit_Program_Button.setForeground(Color.decode("#D9D9D9"));
                Exit_Program_Button.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
                Exit_Program_Button.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
                Exit_Program_Button.setFocusPainted(false);
                panel.add(Exit_Program_Button);

        // Go home and Sleep option trigger
            // Makes you go back to starting window, but a java file
                Home_Sleep_Button.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        frame.dispose();
                        if (e.getSource() == Home_Sleep_Button) {
                            Hotel_Keep_Running Home_Sleep = new Hotel_Keep_Running();
                        }
                    }
                });

        // Switch to Off-Day option trigger
            Work_Button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    frame.dispose();
                    if (e.getSource() == Work_Button) {
                        Work_GUI Work = new Work_GUI();
                    }
                }
            });

        // Gas option trigger
            Gas_Button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    frame.dispose();
                    if (e.getSource() == Gas_Button) {
                        Gas_Gui Gas = new Gas_Gui();
                    }
                }
            });

        // Food option trigger
            food_Button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    frame.dispose();
                    if (e.getSource() == food_Button) {
                        Food_GUI food = new Food_GUI();
                    }
                }
            });

        // Arcade option trigger
            Arcade_Button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    frame.dispose();
                    if (e.getSource() == Arcade_Button) {
                        Arcade_GUI Arcade = new Arcade_GUI();
                    }
                }
            });

            // Gym option trigger
                Gym_Button.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        frame.dispose();
                        if (e.getSource() == Gym_Button) {
                            Gym_GUI Gym = new Gym_GUI();
                        }
                    }
                });

        // Button exit Program
            // Also everything will reset so this will be longer
                Exit_Program_Button.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e){
                            System.exit(0);
                    }
                });

        frame.add(panel);
        frame.setVisible(true);      
    }
}
