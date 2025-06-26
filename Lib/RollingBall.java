package Lib;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

 public class RollingBall extends JPanel implements ActionListener {
  int x = 100;
  int y = 90;
  int start_angle = 0;
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawOval(x,y, 80, 80);
        g.fillArc(x, y, 80, 80 ,start_angle, 180);
    }

    public RollingBall() {
        Timer t1 = new Timer(100, this);
        t1.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        x = x-2; 
        start_angle = start_angle + 2 ;
        if( x== -80) {x = getWidth(); }
        if (start_angle == 360) { start_angle = 0; }
        repaint();
    } 
}

  



