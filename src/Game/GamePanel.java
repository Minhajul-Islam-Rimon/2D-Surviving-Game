package Game;

import javax.swing.JPanel;
import javax.swing.text.html.HTMLDocument.Iterator;

import Inputs.KeyboardInputs;
import Inputs.MouseInputs;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.ListIterator;


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
