package assignment10;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Q1AppletMouseEvent extends Applet implements MouseListener, MouseMotionListener, MouseWheelListener {

    String message = "Start";

    @Override
    public void init() {
        addMouseListener(this);
        addMouseMotionListener(this);
        addMouseWheelListener(this);
    }

    @Override
    public void paint(Graphics g) {
        g.drawString(message, 100, 100);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        message = "Mouse clicked at : (" + e.getX() + "," + e.getY() + ")";
        repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {
        message = "Mouse Pressed at : (" + e.getX() + "," + e.getY() + ")";
        repaint();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        message = "Mouse Release at : (" + e.getX() + "," + e.getY() + ")";
        repaint();
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        message = "Mouse Entered in to area";
        repaint();
    }

    @Override
    public void mouseExited(MouseEvent e) {
        message = "Mouse exited the area";
        repaint();
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        message = "Mouse dragged at : (" + e.getX() + "," + e.getY() + ")";
        repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        message = "Mouse moved at : (" + e.getX() + "," + e.getY() + ")";
        repaint();
    }

    @Override
    public void mouseWheelMoved(MouseWheelEvent e) {
        message = "Mouse scrolled";
        repaint();
    }
    
}
