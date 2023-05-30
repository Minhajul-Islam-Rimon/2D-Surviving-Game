package inputs;

import java.awt.event.KeyListener;

import game.GamePanel;

import java.awt.event.KeyEvent;


public class KeyboardInputs implements KeyListener{
    private GamePanel gamePanel;
    public KeyboardInputs(GamePanel gamePanel){
        this.gamePanel=gamePanel;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("Hello");
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}