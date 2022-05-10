package pkg4ita_2048;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Klavesnice implements KeyListener{
    
    Game g;
    scoreBoard board;
 
    Klavesnice(Game myGame, scoreBoard score) {
        g = myGame;
        board = score;
    }
 
    private void doGameOver() {
        if (g.game_Over) {
            board.showGameOver = true;
        } else if(g.game_Won) {
            board.showGameWon = true;
        }
 
        board.Update();
    }
 
    @Override
    public void keyTyped(KeyEvent e) {

 

    }
 
    @Override
    public void keyPressed(KeyEvent e) {
        int c = e.getKeyCode();
        switch (c) {
            case KeyEvent.VK_UP:
                if (!g.game_Over) {
                    board.Update();
                    g.slide_Up();
                    if(g.game_Won){
                        doGameOver();
                    }
                } else {
                    doGameOver();
                }
                break;
            case KeyEvent.VK_DOWN:
                if (!g.game_Over) {
                    board.Update();
                    g.slide_Down();
                    if(g.game_Won){
                        doGameOver();
                    }
                } else {
                    doGameOver();
                }
                break;
            case KeyEvent.VK_LEFT: {
                if (!g.game_Over) {
                    board.Update();
                    try {
                        g.slide_Left();
                        if(g.game_Won){
                            doGameOver();
                        }
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Klavesnice.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    doGameOver();
                }
            }
            break;
            case KeyEvent.VK_RIGHT:
                if (!g.game_Over) {
                    board.Update();
                    g.slide_Right();
                    if(g.game_Won){
                        doGameOver();
                    }
                } else {
                    doGameOver();
                }
                break;
            default:
                break;
        }
    }
 
    @Override
    public void keyReleased(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
