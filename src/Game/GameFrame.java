package Game;

import javax.swing.JFrame;

public class GameFrame {
    public static void main(String[]args) {

        JFrame jframe = new JFrame();
        // this.jframe.add(gamePanel);


        jframe.setVisible(true);
        jframe.setSize(600, 600);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //jframe.SetLocation(200,50);
        jframe.setBounds(200,50,400,300);
        jframe.setTitle("Survival");



    }
}
