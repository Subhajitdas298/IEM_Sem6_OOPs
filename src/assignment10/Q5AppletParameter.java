package assignment10;

import java.applet.Applet;
import java.awt.Graphics;
/*
package has to be removed if run from some.html
*/
/*
<applet code="Q5AppletParameter.class" width=300 height=300>
  <param name="name" value="Geralt"/>
  <param name="message" value="I hate portals"/>
</applet>
*/

public class Q5AppletParameter extends Applet{

    private String personName;
    private String message;
    
    @Override
    public void init() {
        personName = getParameter("personname");
        message = getParameter("message");
    }
    
    @Override
    public void paint(Graphics g) {
        g.drawString(personName, 80, 20);
        g.drawString(message, 100, 40);
    }
    
}
