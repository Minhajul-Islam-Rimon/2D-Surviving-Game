package ui;

import java.awt.Color;
import java.awt.Graphics;

import game.GamePanel;

public class DeathScreen extends UiObject {

    public DeathScreen(GamePanel gamePanel) {
        super(gamePanel);

    }

    @Override
    public void update() {

    }

    @Override
    public void render(Graphics g) {
        if(this.gamePanel.player.stats.currentHealth <= 0) {
            g.setColor(new Color(168, 50, 50));
            g.fillRect(300, 300, 1000, 300);
            g.setFont(g.getFont().deriveFont(100f));
            g.setColor(new Color(255, 255, 255));
            g.drawString("Game Over", 540, 450);
        }

    }

}
