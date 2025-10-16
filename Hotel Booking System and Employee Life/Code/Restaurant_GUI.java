import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Restaurant_GUI {
    Restaurant_GUI(){
        // Window Frame
            JFrame frame = new JFrame("Restaurant Options window");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 800);
            JPanel panel = new JPanel();
            panel.setLayout(null);
            panel.setBackground(Color.decode("#1e1e1e"));

        // Welcome to the work section
                JLabel element4 = new JLabel("Welcome to the Restaurant section!!");
                element4.setBounds(150, 30, 500, 50);
                element4.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 30));
                element4.setForeground(Color.decode("#D9D9D9"));
                panel.add(element4);

        // JButtions
            // Restaurant Lobby Level
                JButton Restaurant_Lobby_Level_Button = new JButton(" Restaurant Lobby Level");
                Restaurant_Lobby_Level_Button.setBounds(100, 150, 200, 50);
                Restaurant_Lobby_Level_Button.setBackground(Color.decode("#2e2e2e"));
                Restaurant_Lobby_Level_Button.setForeground(Color.decode("#D9D9D9"));
                Restaurant_Lobby_Level_Button.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
                Restaurant_Lobby_Level_Button.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
                Restaurant_Lobby_Level_Button.setFocusPainted(false);
                panel.add(Restaurant_Lobby_Level_Button);

            // Roof Top Restaurant
                JButton Roof_Top_Restaurant_Button = new JButton("Roof Top Restaurant");
                Roof_Top_Restaurant_Button.setBounds(350, 150, 200, 50);
                Roof_Top_Restaurant_Button.setBackground(Color.decode("#2e2e2e"));
                Roof_Top_Restaurant_Button.setForeground(Color.decode("#D9D9D9"));
                Roof_Top_Restaurant_Button.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
                Roof_Top_Restaurant_Button.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
                Roof_Top_Restaurant_Button.setFocusPainted(false);
                panel.add(Roof_Top_Restaurant_Button);

            // Go Back
                JButton Go_Back_Button = new JButton("Go back");
                Go_Back_Button.setBounds(580, 710, 200, 50);
                Go_Back_Button.setBackground(Color.decode("#2e2e2e"));
                Go_Back_Button.setForeground(Color.decode("#D9D9D9"));
                Go_Back_Button.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
                Go_Back_Button.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
                Go_Back_Button.setFocusPainted(false);
                panel.add(Go_Back_Button);
            
        // Restaurant Lobby Level trigger
            Restaurant_Lobby_Level_Button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    frame.dispose();
                    if (e.getSource() == Restaurant_Lobby_Level_Button) {
                        Restaurant_Lobby_Level_GUI Lobby_Restaurant = new Restaurant_Lobby_Level_GUI();
                    }
                }
            });

        // Roof Top Restaurant trigger
            Roof_Top_Restaurant_Button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    frame.dispose();
                    if (e.getSource() == Roof_Top_Restaurant_Button) {
                        Roof_Top_Restaurant_GUI Roof_Top_Restaurant = new Roof_Top_Restaurant_GUI();
                    }
                }
            });

        // Go back trigger
            Go_Back_Button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    frame.dispose();
                    if (e.getSource() == Go_Back_Button) {
                        Work_GUI Work = new Work_GUI();
                    }
                }
            });

        frame.add(panel);
        frame.setVisible(true);    
    }
}
