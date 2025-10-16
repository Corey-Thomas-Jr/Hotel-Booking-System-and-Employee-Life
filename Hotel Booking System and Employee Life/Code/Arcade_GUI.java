import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Arcade_GUI {
    Arcade_GUI(){
        // Window Frame
            JFrame frame = new JFrame("Arcade window");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 800);
            JPanel panel = new JPanel();
            panel.setLayout(null);
            panel.setBackground(Color.decode("#1e1e1e"));

        // Welcome to the Arcade section
                JLabel Arcade = new JLabel("Welcome to the Arcade section!!");
                Arcade.setBounds(150, 30, 1000, 50);
                Arcade.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 30));
                Arcade.setForeground(Color.decode("#D9D9D9"));
                panel.add(Arcade);

        // JButtions
            // Tic Tac Toe
                JButton Tic_Tac_Toe_Button = new JButton("Tic Tac Toe");
                Tic_Tac_Toe_Button.setBounds(100, 150, 200, 50);
                Tic_Tac_Toe_Button.setBackground(Color.decode("#2e2e2e"));
                Tic_Tac_Toe_Button.setForeground(Color.decode("#D9D9D9"));
                Tic_Tac_Toe_Button.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
                Tic_Tac_Toe_Button.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
                Tic_Tac_Toe_Button.setFocusPainted(false);
                panel.add(Tic_Tac_Toe_Button);

            
            // Go Back
                JButton Go_Back_Button = new JButton("Go back");
                Go_Back_Button.setBounds(580, 710, 200, 50);
                Go_Back_Button.setBackground(Color.decode("#2e2e2e"));
                Go_Back_Button.setForeground(Color.decode("#D9D9D9"));
                Go_Back_Button.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
                Go_Back_Button.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
                Go_Back_Button.setFocusPainted(false);
                panel.add(Go_Back_Button);

            // Go back trigger
                Go_Back_Button.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        frame.dispose();
                        if (e.getSource() == Go_Back_Button) {
                            Off_Work_GUI off_work = new Off_Work_GUI();
                        }
                    }
                });

            // Tic Tac Toe trigger
                Tic_Tac_Toe_Button.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        frame.dispose();
                        if (e.getSource() == Tic_Tac_Toe_Button) {
                            Tic_Tak_Toe_Game T_T_T = new Tic_Tak_Toe_Game();
                        }
                    }
                });

        frame.add(panel);
        frame.setVisible(true);
    }
}
