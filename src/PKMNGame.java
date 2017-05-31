import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class PKMNGame extends JComponent{

    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        Rectangle box = new Rectangle(0, 0, 400, 200);
        //newG start = new newG();
        //start.newGame();
        //SCREEN//
        g.setColor(Color.black);
        g2.setStroke(new BasicStroke(3));
        g2.draw(box);
        g.setColor(Color.white);
        g.fillRect(3, 3, 395, 195);
        //Buttons//
        //g.setColor(Color.white);
        //g.fillRect(3, 3, 395, 195);
        Ellipse2D.Double aButton = new Ellipse2D.Double(260, 240, 55, 55);
        Ellipse2D.Double bButton = new Ellipse2D.Double(310, 280, 55, 55);
        g2.setColor(Color.green);
        g2.fill(aButton);
        g2.setColor(Color.red);
        g2.fill(bButton);
        //D-PAD//
        g.setColor(Color.lightGray);
        g.fillRect(140, 260, 50, 25);

    }
}
