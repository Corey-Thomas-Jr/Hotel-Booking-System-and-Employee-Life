import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Lobby_Floor_Pool_GUI {
    Lobby_Floor_Pool_GUI(){
        // Window Frame
            JFrame frame = new JFrame("Lobby Floor Pool window");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 800);
            JPanel panel = new JPanel();
            panel.setLayout(null);
            panel.setBackground(Color.decode("#1e1e1e"));

        // Welcome to the Lobby Floor Pool section
            JLabel L_F_P = new JLabel("Welcome to the Looby Floor Pool ^_^");
            L_F_P.setBounds(150, 30, 500, 50);
            L_F_P.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 30));
            L_F_P.setForeground(Color.decode("#D9D9D9"));
            panel.add(L_F_P);

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
                        Pool_GUI Work = new Pool_GUI();
                    }
                }
            });

        frame.add(panel);
        frame.setVisible(true);
    }
}
