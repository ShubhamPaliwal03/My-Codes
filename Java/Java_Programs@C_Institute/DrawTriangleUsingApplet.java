import java.applet.*;
import java.awt.*;

public class DrawTriangleUsingApplet extends Applet
{
	public void paint(Graphics g)
	{
		g.drawLine(40,400,320,400);
		g.drawLine(40,400,180,40);
		g.drawLine(180,40,320,400);
	}
}

// <applet height="500" width="500" code="DrawTriangleUsingApplet.java"></applet>