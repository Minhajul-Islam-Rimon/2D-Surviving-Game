package Game;

import javax.swing.JFrame;

public class GameFrame {

JFrame jframe;

public GameFrame(GamePanel gamePanel) {


    JFrame jframe = new JFrame("Survival");

    this.jframe.add(gamePanel);

    jframe.setSize(600, 600);
    jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //jframe.SetLocation(200,50);
   // jframe.setBounds(200, 50, 400, 300);
    //jframe.setTitle("Survival");
    jframe.setLocationRelativeTo(null);
    jframe.setVisible(true);


    }
}
