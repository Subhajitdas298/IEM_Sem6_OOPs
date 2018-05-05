package assignment10;

import java.applet.*;
import java.awt.Graphics;
import java.awt.event.*;

public class Q2AppletKeyboardEvent extends Applet implements KeyListener {

    String message = "";

    @Override
    public void init() {
        addKeyListener(this);
        requestFocus();
    }

    @Override
    public void paint(Graphics g) {
        g.drawString(message, 100, 100);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        showStatus("Key typed");
    }

    @Override
    public void keyPressed(KeyEvent e) {
        showStatus("Key pressed");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        message += e.getKeyChar();
        repaint();
    }

}
