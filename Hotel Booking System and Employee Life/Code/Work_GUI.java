import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Work_GUI {
    Work_GUI(){
        // Window Frame
            JFrame frame = new JFrame("Hotel/Work window");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 800);
            JPanel panel = new JPanel();
            panel.setLayout(null);
            panel.setBackground(Color.decode("#1e1e1e"));

        // JLabels
            // Welcome to the work section
                JLabel Work = new JLabel("Welcome to the work section!!");
                Work.setBounds(150, 30, 500, 50);
                Work.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 30));
                Work.setForeground(Color.decode("#D9D9D9"));
                panel.add(Work);

        // Jbuttons
            // Customer
                JButton Costumer_Button = new JButton("Costumer");
                Costumer_Button.setBounds(100, 150, 200, 50);
                Costumer_Button.setBackground(Color.decode("#2e2e2e"));
                Costumer_Button.setForeground(Color.decode("#D9D9D9"));
                Costumer_Button.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
                Costumer_Button.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
                Costumer_Button.setFocusPainted(false);
                panel.add(Costumer_Button);

            // Pool
                JButton Pool_Button = new JButton("Pool");
                Pool_Button.setBounds(350, 150, 200, 50);
                Pool_Button.setBackground(Color.decode("#2e2e2e"));
                Pool_Button.setForeground(Color.decode("#D9D9D9"));
                Pool_Button.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
                Pool_Button.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
                Pool_Button.setFocusPainted(false);
                panel.add(Pool_Button);

            // Restaurant
                JButton Restaurant_Button = new JButton("Restaurant");
                Restaurant_Button.setBounds(100, 250, 200, 50);
                Restaurant_Button.setBackground(Color.decode("#2e2e2e"));
                Restaurant_Button.setForeground(Color.decode("#D9D9D9"));
                Restaurant_Button.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
                Restaurant_Button.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
                Restaurant_Button.setFocusPainted(false);
                panel.add(Restaurant_Button);

            // Game Rooom
                JButton Game_Room_Button = new JButton("Game Room");
                Game_Room_Button.setBounds(350, 250, 200, 50);
                Game_Room_Button.setBackground(Color.decode("#2e2e2e"));
                Game_Room_Button.setForeground(Color.decode("#D9D9D9"));
                Game_Room_Button.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
                Game_Room_Button.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
                Game_Room_Button.setFocusPainted(false);
                panel.add(Game_Room_Button);

            // Break Room
                JButton Break_Room_Button = new JButton("Break Room");
                Break_Room_Button.setBounds(230, 325, 200, 50);
                Break_Room_Button.setBackground(Color.decode("#2e2e2e"));
                Break_Room_Button.setForeground(Color.decode("#D9D9D9"));
                Break_Room_Button.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
                Break_Room_Button.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
                Break_Room_Button.setFocusPainted(false);
                panel.add(Break_Room_Button);

            // Go home and Sleep
                JButton Home_Sleep_Button = new JButton("Go home and sleep");
                Home_Sleep_Button.setBounds(580, 590, 200, 50);
                Home_Sleep_Button.setBackground(Color.decode("#2e2e2e"));
                Home_Sleep_Button.setForeground(Color.decode("#D9D9D9"));
                Home_Sleep_Button.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
                Home_Sleep_Button.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
                Home_Sleep_Button.setFocusPainted(false);
                panel.add(Home_Sleep_Button);

            // Off-Work
                JButton Off_Work_Button = new JButton("Go Off-Work");
                Off_Work_Button.setBounds(580, 650, 200, 50);
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
            Off_Work_Button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    frame.dispose();
                    if (e.getSource() == Off_Work_Button) {
                        Off_Work_GUI Off_Work = new Off_Work_GUI();
                    }
                }
            });

        // Pool option trigger
            Pool_Button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    frame.dispose();
                    if (e.getSource() == Pool_Button) {
                        Pool_GUI Pool = new Pool_GUI();
                    }
                }
            });

        // Restaurant option trigger
            Restaurant_Button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    frame.dispose();
                    if (e.getSource() == Restaurant_Button) {
                        Restaurant_GUI Restaurant = new Restaurant_GUI();
                    }
                }
            });

        // Restaurant option trigger
            Game_Room_Button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    frame.dispose();
                    if (e.getSource() == Game_Room_Button) {
                        Game_Room_GUI Game_Room = new Game_Room_GUI();
                    }
                }
            });

        // Restaurant option trigger
           Break_Room_Button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    frame.dispose();
                    if (e.getSource() == Break_Room_Button) {
                        Break_Room_GUI Break_Room = new Break_Room_GUI();
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
