package game;

import javax.swing.JPanel;

import inputs.KeyboardInputs;


import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;


public class GamePanel  extends JPanel{
    int x = 200, y = 200;

	    public GamePanel() {
	        addKeyListener(new KeyboardInputs(this));
            //addMouseMotionListener(new MouseInputs(this));
	    }

    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        //graphics.drawRect(x, y, 100, 200);
        Graphics2D graphics2D=(Graphics2D) graphics;
        graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        update(graphics);
    }


    public void move() {
        //repaint();
        x += (int)1 * 0.016667;

    }

}
