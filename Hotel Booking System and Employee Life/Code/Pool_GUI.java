import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Pool_GUI {
    Pool_GUI(){
        // Window Frame
            JFrame frame = new JFrame("Pool Options window");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 800);
            JPanel panel = new JPanel();
            panel.setLayout(null);
            panel.setBackground(Color.decode("#1e1e1e"));

        // Welcome to the Pool section
            JLabel element4 = new JLabel("Welcome to the Pool section!!");
            element4.setBounds(150, 30, 500, 50);
            element4.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 30));
            element4.setForeground(Color.decode("#D9D9D9"));
            panel.add(element4);

        // Jbuttons
            // Roof Top Pool
                JButton Roof_Top_Button = new JButton("Roof Top Pool");
                Roof_Top_Button.setBounds(100, 150, 200, 50);
                Roof_Top_Button.setBackground(Color.decode("#2e2e2e"));
                Roof_Top_Button.setForeground(Color.decode("#D9D9D9"));
                Roof_Top_Button.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
                Roof_Top_Button.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
                Roof_Top_Button.setFocusPainted(false);
                panel.add(Roof_Top_Button);

            // Lobby Floor Pool
                JButton Lobby_Flor_Button = new JButton("Lobbhy Floor Pool");
                Lobby_Flor_Button.setBounds(350, 150, 200, 50);
                Lobby_Flor_Button.setBackground(Color.decode("#2e2e2e"));
                Lobby_Flor_Button.setForeground(Color.decode("#D9D9D9"));
                Lobby_Flor_Button.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
                Lobby_Flor_Button.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
                Lobby_Flor_Button.setFocusPainted(false);
                panel.add(Lobby_Flor_Button);

            // Go Back
                JButton Go_Back_Button = new JButton("Go back");
                Go_Back_Button.setBounds(580, 710, 200, 50);
                Go_Back_Button.setBackground(Color.decode("#2e2e2e"));
                Go_Back_Button.setForeground(Color.decode("#D9D9D9"));
                Go_Back_Button.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
                Go_Back_Button.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
                Go_Back_Button.setFocusPainted(false);
                panel.add(Go_Back_Button);

        // Roof Top Pool trigger
            Roof_Top_Button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    frame.dispose();
                    if (e.getSource() == Roof_Top_Button) {
                        Roof_Top_Pool_GUI Top_pool = new Roof_Top_Pool_GUI();
                    }
                }
            });

        // Lobby Floor Pool trigger
            Lobby_Flor_Button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    frame.dispose();
                    if (e.getSource() == Lobby_Flor_Button) {
                        Lobby_Floor_Pool_GUI Lobby_pool = new Lobby_Floor_Pool_GUI();
                    }
                }
            });

        // Go Back trigger
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
