package assignment10;

import java.applet.*;
import java.awt.Color;
import java.awt.Graphics;

public class Q3AppletDisplayExample extends Applet {

    @Override
    public void paint(Graphics g) {
        setForeground(Color.MAGENTA);
        setBackground(Color.YELLOW);
        // line
        g.drawLine(120, 10, 100, 120);
        // rectangle
        g.drawRect(200, 200, 50, 60);
        g.fillRect(200, 300, 70, 20);
        // cllipse
        g.drawOval(100, 200, 20, 50);
        g.setColor(Color.BLACK);
        g.fillOval(200, 200, 20, 50);
        // arc
        g.fillArc(200, 10, 100, 40, 10, 90);
        // polygon
        int x[] = {400, 500, 400, 500};
        int y[] = {240, 240, 340, 340};
        g.drawPolyline(x, y, 4);
    }

}
