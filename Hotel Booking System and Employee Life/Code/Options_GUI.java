import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Options_GUI {
    Options_GUI() {
        // Window Frame
            JFrame frame = new JFrame("Options Window");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 800);
            JPanel panel = new JPanel();
            panel.setLayout(null);
            panel.setBackground(Color.decode("#1e1e1e"));
            
        // JLabels
            // Title
                JLabel Title = new JLabel("How do you want to start your day?");
                Title.setBounds(200, 8, 400, 50);
                Title.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 25));
                Title.setForeground(Color.decode("#D9D9D9"));
                panel.add(Title);
            
            // Pick a option
                JLabel option = new JLabel("Please pick an option");
                option.setBounds(240, 70, 400, 50);
                option.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 25));
                option.setForeground(Color.decode("#D9D9D9"));
                panel.add(option);
            
        // Jbuttons
            // Work
                JButton Work_Button = new JButton("Work");
                Work_Button.setBounds(100, 200, 239, 104);
                Work_Button.setBackground(Color.decode("#2e2e2e"));
                Work_Button.setForeground(Color.decode("#D9D9D9"));
                Work_Button.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
                Work_Button.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
                Work_Button.setFocusPainted(false);
                panel.add(Work_Button);

            // Off-Work
                JButton Off_Work_Button = new JButton("Off-Work");
                Off_Work_Button.setBounds(400, 200, 239, 104);
                Off_Work_Button.setBackground(Color.decode("#2e2e2e"));
                Off_Work_Button.setForeground(Color.decode("#D9D9D9"));
                Off_Work_Button.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
                Off_Work_Button.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
                Off_Work_Button.setFocusPainted(false);
                panel.add(Off_Work_Button);
            
             // Exit Program
                JButton Exit_Program_Button = new JButton("Exit Program");
                Exit_Program_Button.setBounds(580, 710, 200, 50);
                Exit_Program_Button.setBackground(Color.decode("#2e2e2e"));
                Exit_Program_Button.setForeground(Color.decode("#D9D9D9"));
                Exit_Program_Button.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
                Exit_Program_Button.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
                Exit_Program_Button.setFocusPainted(false);
                panel.add(Exit_Program_Button);
            
            // Work option trigger
                Work_Button.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        frame.dispose();
                        if (e.getSource() == Work_Button) {
                            Work_GUI work_Window = new Work_GUI();
                        }
                    }
                });

        // Off-Work option trigger
            Off_Work_Button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    frame.dispose();
                    if (e.getSource() == Off_Work_Button) {
                        Off_Work_GUI off_Work_Window = new Off_Work_GUI();
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
