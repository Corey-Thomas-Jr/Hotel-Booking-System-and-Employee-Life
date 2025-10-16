import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Hotel_Keep_Running {
    Hotel_Keep_Running(){
         // Starting Window Frame 
            JFrame frame = new JFrame("Hotel Booking System and Employee Simulation");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 800);
            JPanel panel = new JPanel();
            panel.setLayout(null);
            panel.setBackground(Color.decode("#1e1e1e"));

        // JLabels
            // Wake Up
                JLabel element4 = new JLabel("Wake Up!!");
                element4.setBounds(300, 8, 336, 23);
                element4.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 25));
                element4.setForeground(Color.decode("#D9D9D9"));
                panel.add(element4);

            // ^_^
                JLabel element5 = new JLabel("^_^");
                element5.setBounds(335, 30, 243, 57);
                element5.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 25));
                element5.setForeground(Color.decode("#D9D9D9"));
                panel.add(element5);

            // Time to start your day
                JLabel element6 = new JLabel("Time to start your day");
                element6.setBounds(260, 70, 243, 57);
                element6.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 25));
                element6.setForeground(Color.decode("#D9D9D9"));
                panel.add(element6);

            // ^_^
                JLabel element7 = new JLabel("^_^");
                element7.setBounds(335, 105, 243, 57);
                element7.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 25));
                element7.setForeground(Color.decode("#D9D9D9"));
                panel.add(element7);

        // Jbuttons
            // Continue Day
                JButton Continue_Day_Buttton = new JButton("Continue Day");
                Continue_Day_Buttton.setBounds(100, 200, 239, 104);
                Continue_Day_Buttton.setBackground(Color.decode("#2e2e2e"));
                Continue_Day_Buttton.setForeground(Color.decode("#D9D9D9"));
                Continue_Day_Buttton.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
                Continue_Day_Buttton.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
                Continue_Day_Buttton.setFocusPainted(false);
                panel.add(Continue_Day_Buttton);

            // Next Day
                JButton Next_Day_Buttton = new JButton("Next Day");
                Next_Day_Buttton.setBounds(400, 200, 239, 104);
                Next_Day_Buttton.setBackground(Color.decode("#2e2e2e"));
                Next_Day_Buttton.setForeground(Color.decode("#D9D9D9"));
                Next_Day_Buttton.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
                Next_Day_Buttton.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
                Next_Day_Buttton.setFocusPainted(false);
                panel.add(Next_Day_Buttton);

            // What you did today
                    JButton What_you_did_today_Buttton = new JButton("What you did today");
                What_you_did_today_Buttton.setBounds(260, 330, 200, 50);
                What_you_did_today_Buttton.setBackground(Color.decode("#2e2e2e"));
                What_you_did_today_Buttton.setForeground(Color.decode("#D9D9D9"));
                What_you_did_today_Buttton.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
                What_you_did_today_Buttton.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
                What_you_did_today_Buttton.setFocusPainted(false);
                panel.add(What_you_did_today_Buttton);

            // Exit Program
                JButton Exit_Program_Buttton = new JButton("Exit Program");
                Exit_Program_Buttton.setBounds(580, 710, 200, 50);
                Exit_Program_Buttton.setBackground(Color.decode("#2e2e2e"));
                Exit_Program_Buttton.setForeground(Color.decode("#D9D9D9"));
                Exit_Program_Buttton.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
                Exit_Program_Buttton.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
                Exit_Program_Buttton.setFocusPainted(false);
                panel.add(Exit_Program_Buttton);

        // TextField
            // Summary of your day to show on GUI
                JLabel Summary_Of_Day = new JLabel("Summary of your Day Here ^_^");
                Summary_Of_Day.setBounds(100, 300, 200, 300);
                Summary_Of_Day.setForeground(Color.decode("#D9D9D9"));
                panel.add(Summary_Of_Day);

        // Contnue Day option trigger
            Continue_Day_Buttton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    frame.dispose();
                    if (e.getSource() == Continue_Day_Buttton) {
                        Options_GUI Options_Window = new Options_GUI();
                    }
                }
            });

        // Contnue Day option trigger
        // Also everything will reset so this will be longer
            Next_Day_Buttton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    frame.dispose();
                    if (e.getSource() == Next_Day_Buttton) {
                        Options_GUI Options_Window = new Options_GUI();
                    }
                }
            });

        // Button exit Program
        // Also everything will reset so this will be longer
            Exit_Program_Buttton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e){
                            System.exit(0);
                    }
            });

        frame.add(panel);
        frame.setVisible(true);
    }
}
