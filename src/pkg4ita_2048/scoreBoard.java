package pkg4ita_2048;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class scoreBoard extends JPanel {

    Game game;
    public boolean showGameOver = false;
    public boolean showGameWon = false;

    scoreBoard(Game g) {
        game = g;
       
    }

    @Override
    public void paintComponent(Graphics g) {

        if (showGameOver) {
            g.setColor(Color.BLACK);
            g.setFont(new Font("Arial", Font.BOLD, 64));
            g.drawString("GAME OVER", 30, 240);

        }
        if (showGameWon) {
            g.setColor(Color.BLACK);
            g.setFont(new Font("Arial", Font.BOLD, 64));
            g.drawString("YOU WON!!", 30, 240);

        }
    }

    public void Update() {
        repaint();
    }
}

