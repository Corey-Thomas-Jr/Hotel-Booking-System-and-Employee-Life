import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Wake_Up_GUI_Driver {
    public static void main(String[] args) {
        // Starting Window Frame
            JFrame frame = new JFrame("Hotel Booking System and Employee Simulation");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 800);
            JPanel panel = new JPanel();
            panel.setLayout(null);
            panel.setBackground(Color.decode("#1e1e1e"));

        // JLabels
            // Wake Up
                JLabel Wake_Up = new JLabel("Wake Up!!");
                Wake_Up.setBounds(300, 8, 336, 23);
                Wake_Up.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 25));
                Wake_Up.setForeground(Color.decode("#D9D9D9"));
                panel.add(Wake_Up);

            // ^_^
                JLabel face = new JLabel("^_^");
                face.setBounds(335, 30, 243, 57);
                face.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 25));
                face.setForeground(Color.decode("#D9D9D9"));
                panel.add(face);

            // Time to start your day
                JLabel start_day = new JLabel("Time to start your day");
                start_day.setBounds(260, 70, 243, 57);
                start_day.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 25));
                start_day.setForeground(Color.decode("#D9D9D9"));
                panel.add(start_day);

            // ^_^
                JLabel face_2 = new JLabel("^_^");
                face_2.setBounds(335, 105, 243, 57);
                face_2.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 25));
                face_2.setForeground(Color.decode("#D9D9D9"));
                panel.add(face_2);

        // Jbuttons
            // Continue Day
                JButton Continue_Day_Button = new JButton("Continue Day");
                Continue_Day_Button.setBounds(100, 200, 239, 104);
                Continue_Day_Button.setBackground(Color.decode("#2e2e2e"));
                Continue_Day_Button.setForeground(Color.decode("#D9D9D9"));
                Continue_Day_Button.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
                Continue_Day_Button.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
                Continue_Day_Button.setFocusPainted(false);
                panel.add(Continue_Day_Button);

            // Next Day
                JButton Next_Day_Button = new JButton("Next Day");
                Next_Day_Button.setBounds(400, 200, 239, 104);
                Next_Day_Button.setBackground(Color.decode("#2e2e2e"));
                Next_Day_Button.setForeground(Color.decode("#D9D9D9"));
                Next_Day_Button.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
                Next_Day_Button.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
                Next_Day_Button.setFocusPainted(false);
                panel.add(Next_Day_Button);

            // What you did today
                JButton What_you_did_today_Button = new JButton("What you did today");
                What_you_did_today_Button.setBounds(260, 330, 200, 50);
                What_you_did_today_Button.setBackground(Color.decode("#2e2e2e"));
                What_you_did_today_Button.setForeground(Color.decode("#D9D9D9"));
                What_you_did_today_Button.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
                What_you_did_today_Button.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
                What_you_did_today_Button.setFocusPainted(false);
                panel.add(What_you_did_today_Button);

            // Exit Program
                JButton Exit_Program_Button = new JButton("Exit Program");
                Exit_Program_Button.setBounds(580, 710, 200, 50);
                Exit_Program_Button.setBackground(Color.decode("#2e2e2e"));
                Exit_Program_Button.setForeground(Color.decode("#D9D9D9"));
                Exit_Program_Button.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
                Exit_Program_Button.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
                Exit_Program_Button.setFocusPainted(false);
                panel.add(Exit_Program_Button);

        // TextField
            // Summary of your day to show on GUI
                JLabel Summary_Of_Day = new JLabel("Summary of your Day Here ^_^");
                Summary_Of_Day.setBounds(100, 300, 200, 300);
                Summary_Of_Day.setForeground(Color.decode("#D9D9D9"));
                panel.add(Summary_Of_Day);

        // Continue Day option trigger
            Continue_Day_Button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    frame.dispose();
                    if (e.getSource() == Continue_Day_Button) {
                        Options_GUI Options_Window = new Options_GUI();
                    }
                }
            });

        // Continue Day option trigger
        // Also everything will reset so this will be longer
            Next_Day_Button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    frame.dispose();
                    if (e.getSource() == Next_Day_Button) {
                        Options_GUI Options_Window = new Options_GUI();
                    }
                }
            });

        // Button exit Program
        // Also everything will reset
            Exit_Program_Button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e){
                        System.exit(0);
                }
            });

        frame.add(panel);
        frame.setVisible(true);
    }
}
