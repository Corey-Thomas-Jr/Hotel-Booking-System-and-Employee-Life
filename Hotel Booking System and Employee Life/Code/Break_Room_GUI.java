import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Break_Room_GUI {
    Break_Room_GUI(){
        // Window Frame
            JFrame frame = new JFrame("Break Room Options window");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 800);
            JPanel panel = new JPanel();
            panel.setLayout(null);
            panel.setBackground(Color.decode("#1e1e1e"));

        // Welcome to the Break Room section
                JLabel Break_Room = new JLabel("Welcome to the Break Room section!!");
                Break_Room.setBounds(150, 30, 1500, 50);
                Break_Room.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 30));
                Break_Room.setForeground(Color.decode("#D9D9D9"));
                panel.add(Break_Room);

        // JButtions
            // Break Room Lobby Level
                JButton Break_Room_Lobby_Level_Button = new JButton("Break Room Lobby Level");
                Break_Room_Lobby_Level_Button.setBounds(100, 150, 200, 50);
                Break_Room_Lobby_Level_Button.setBackground(Color.decode("#2e2e2e"));
                Break_Room_Lobby_Level_Button.setForeground(Color.decode("#D9D9D9"));
                Break_Room_Lobby_Level_Button.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
                Break_Room_Lobby_Level_Button.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
                Break_Room_Lobby_Level_Button.setFocusPainted(false);
                panel.add(Break_Room_Lobby_Level_Button);

            // Break Room Second Floor
                JButton Break_Room_Second_Floor_Button = new JButton("Break Room Second Floor");
                Break_Room_Second_Floor_Button.setBounds(350, 150, 200, 50);
                Break_Room_Second_Floor_Button.setBackground(Color.decode("#2e2e2e"));
                Break_Room_Second_Floor_Button.setForeground(Color.decode("#D9D9D9"));
                Break_Room_Second_Floor_Button.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
                Break_Room_Second_Floor_Button.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
                Break_Room_Second_Floor_Button.setFocusPainted(false);
                panel.add(Break_Room_Second_Floor_Button);
            
            // Go Back
                JButton Go_Back_Button = new JButton("Go back");
                Go_Back_Button.setBounds(580, 710, 200, 50);
                Go_Back_Button.setBackground(Color.decode("#2e2e2e"));
                Go_Back_Button.setForeground(Color.decode("#D9D9D9"));
                Go_Back_Button.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
                Go_Back_Button.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
                Go_Back_Button.setFocusPainted(false);
                panel.add(Go_Back_Button);

            // Lobby Floor Pool trigger
                Break_Room_Lobby_Level_Button.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        frame.dispose();
                        if (e.getSource() == Break_Room_Lobby_Level_Button) {
                            Break_Room_Lobby_Level_GUI Break_Room = new Break_Room_Lobby_Level_GUI();
                        }
                    }
                });

            // Lobby Floor Pool trigger
                Break_Room_Second_Floor_Button.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        frame.dispose();
                        if (e.getSource() == Break_Room_Second_Floor_Button) {
                            Break_Room_Second_Floor_GUI Break_Room = new Break_Room_Second_Floor_GUI();
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
