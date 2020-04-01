import java.applet.Applet;
import java.awt.Graphics;

public class HelloWorldApplet extends Applet
{
    public void paint(Graphics g)
    {
        g.drawString ("Hello Wolrd", 150, 150);
    }
}

// For the applet to run we create a html file of any name
// and use this code there to run it