import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Restaurant_Lobby_Level_GUI {
    Restaurant_Lobby_Level_GUI(){
        // Window Frame
            JFrame frame = new JFrame("Restaurant Lobby Level window");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 800);
            JPanel panel = new JPanel();
            panel.setLayout(null);
            panel.setBackground(Color.decode("#1e1e1e"));

        // Welcome to the Restaurant Lobby Level section
            JLabel R_L_L = new JLabel("Welcome to the Restaurant Lobby Level ^_^");
            R_L_L.setBounds(50, 30, 1000, 50);
            R_L_L.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 30));
            R_L_L.setForeground(Color.decode("#D9D9D9"));
            panel.add(R_L_L);

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
                        Restaurant_GUI Work = new Restaurant_GUI();
                    }
                }
            });

        frame.add(panel);
        frame.setVisible(true);
    }
}
