import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class P_P {
    private JPanel boardPanel;
    private JButton[][] cells = new JButton[3][3];

    private char currentPlayer = 'X';
    private boolean gameOver = false;

    public P_P() {
        JFrame frame = new JFrame("Player 2 Window");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.decode("#1e1e1e"));

    // JLabels
        // Player 1 vs Player 2
            JLabel element4 = new JLabel("Player 1 vs Player 2");
            element4.setBounds(240, 50, 336, 23);
            element4.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 25));
            element4.setForeground(Color.decode("#D9D9D9"));
            panel.add(element4);

        // Turn Indicator
            JLabel turnLabel = new JLabel("Turn: Player X");
            turnLabel.setBounds(320, 90, 200, 24);
            turnLabel.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 18));
            turnLabel.setForeground(Color.decode("#D9D9D9"));
            panel.add(turnLabel);

        // Game Board
            boardPanel = new JPanel(new GridLayout(3, 3, 8, 8));
            boardPanel.setBackground(Color.decode("#1e1e1e"));
            boardPanel.setBounds(200, 130, 400, 400);
            panel.add(boardPanel);

            for (int r = 0; r < 3; r++) {
                for (int c = 0; c < 3; c++) {
                    JButton cell = new JButton("");
                    cell.setFocusPainted(false);
                    cell.setBackground(Color.decode("#2e2e2e"));
                    cell.setForeground(Color.decode("#D9D9D9"));
                    cell.setFont(safeFont(36));
                    cell.setBorder(new RoundedBorder(6, Color.decode("#979797"), 2));
                    final int rr = r, cc = c;
                    cell.addActionListener(e -> handleMove(rr, cc, turnLabel));
                    cells[r][c] = cell;
                    boardPanel.add(cell);
                }
            }

    // Jbuttons
        // Options
            JButton Options_Button = new JButton("Options");
            Options_Button.setBounds(580, 650, 200, 50);
            Options_Button.setBackground(Color.decode("#2e2e2e"));
            Options_Button.setForeground(Color.decode("#D9D9D9"));
            Options_Button.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
            Options_Button.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
            Options_Button.setFocusPainted(false);
            panel.add(Options_Button);

        // Main Menu
            JButton Main_Menu = new JButton("Main Menu");
            Main_Menu.setBounds(580, 710, 200, 50);
            Main_Menu.setBackground(Color.decode("#2e2e2e"));
            Main_Menu.setForeground(Color.decode("#D9D9D9"));
            Main_Menu.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
            Main_Menu.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
            Main_Menu.setFocusPainted(false);
            panel.add(Main_Menu);
            
        // Reset
            JButton Reset_Button = new JButton("Reset");
            Reset_Button.setBounds(200, 560, 120, 40);
            Reset_Button.setBackground(Color.decode("#2e2e2e"));
            Reset_Button.setForeground(Color.decode("#D9D9D9"));
            Reset_Button.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
            Reset_Button.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
            Reset_Button.setFocusPainted(false);
            Reset_Button.addActionListener(e -> resetGame(turnLabel));
            panel.add(Reset_Button);

    // Options button trigger
        Options_Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                if (e.getSource() == Options_Button) {
                    Tic_Tac_Toe_Options O = new Tic_Tac_Toe_Options();
                }
            }
        });

    // Main Menu button trigger
        Main_Menu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                if (e.getSource() == Main_Menu) {
                    Tik_Tac_Toe_Keep_Running K_R = new Tik_Tac_Toe_Keep_Running();
                }
            }
        });

        frame.add(panel);
        frame.setVisible(true);
    }

    private void handleMove(int r, int c, JLabel turnLabel) {
        if (gameOver) return;
        JButton b = cells[r][c];
        if (!b.getText().isEmpty()) return; // already filled

        b.setText(String.valueOf(currentPlayer));

        if (checkWin(currentPlayer)) {
            gameOver = true;
            JOptionPane.showMessageDialog(null, "Player " + currentPlayer + " wins!", "Game Over",
                    JOptionPane.INFORMATION_MESSAGE);
            turnLabel.setText("Winner: Player " + currentPlayer);
            return;
        }

        if (checkDraw()) {
            gameOver = true;
            JOptionPane.showMessageDialog(null, "Draw!", "Game Over", JOptionPane.INFORMATION_MESSAGE);
            turnLabel.setText("Draw");
            return;
        }

        // swap player
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        turnLabel.setText("Turn: Player " + currentPlayer);
    }

    private boolean checkWin(char p) {
        String tgt = String.valueOf(p);
        
        // rows & cols
        for (int i = 0; i < 3; i++) {
            if (cells[i][0].getText().equals(tgt) && cells[i][1].getText().equals(tgt) && cells[i][2].getText().equals(tgt))
                return true;
            if (cells[0][i].getText().equals(tgt) && cells[1][i].getText().equals(tgt) && cells[2][i].getText().equals(tgt))
                return true;
        }
        
        // diagonals
        if (cells[0][0].getText().equals(tgt) && cells[1][1].getText().equals(tgt) && cells[2][2].getText().equals(tgt))
            return true;
        if (cells[0][2].getText().equals(tgt) && cells[1][1].getText().equals(tgt) && cells[2][0].getText().equals(tgt))
            return true;
        return false;
    }

    private boolean checkDraw() {
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                if (cells[r][c].getText().isEmpty()) return false;
            }
        }
        return true;
    }

    private void resetGame(JLabel turnLabel) {
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                cells[r][c].setText("");
                cells[r][c].setEnabled(true);
            }
        }
        currentPlayer = 'X';
        gameOver = false;
        turnLabel.setText("Turn: Player X");
    }

    // Fallback font if CustomFontLoader fails or isn’t present
        private Font safeFont(int size) {
            try {
                return CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", size);
            } catch (Throwable t) {
                return new Font("SansSerif", Font.PLAIN, size);
            }
        }
}
