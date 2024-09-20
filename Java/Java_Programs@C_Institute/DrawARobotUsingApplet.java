import java.awt.*;
import java.applet.*;

public class DrawARobotUsingApplet extends Applet
{
	public void paint(Graphics g)
	{	
		setBackground(Color.BLACK);

		g.setColor(Color.WHITE);

		// antenna balls

		g.setColor(Color.RED);

		g.fillOval(95, 24, 15, 15);
		g.fillOval(160, 24, 15, 15);

		//	antenna lines
		
		g.setColor(Color.WHITE);
		g.drawLine(105, 39, 120, 75);
		g.drawLine(165, 39, 150, 75);

		// face

		g.drawRect(90, 75, 90, 75);

		// eyes

		g.drawOval(105, 90, 21, 21);
		g.drawOval(149, 90, 21, 21);

		// mouth

		g.drawRect(120, 120, 30, 15);

		// neck

		g.drawRect(123, 150, 25, 45);

		// stomach

		g.drawRect(75, 195, 120, 114);

		// circle in stomach

		g.drawOval(100, 219, 69, 69);

		// lines around the circle in the stomach

		g.drawLine(75, 195, 112, 227);  // 1
		g.drawLine(195, 195, 157, 226); // 2
		g.drawLine(108, 274, 75, 309);  // 3
		g.drawLine(162, 276, 195, 309); // 4

		// legs

		g.drawRect(105, 309, 20, 45);
		g.drawRect(150, 309, 20, 45);

		// feet

		g.drawRect(90, 354, 35, 24);
		g.drawRect(150, 354, 35, 24);

		// arms

		g.drawRect(51, 241, 24, 15);
		g.drawRect(195, 241, 24, 15);

		// hands

		g.drawRect(36, 234, 15, 30);
		g.drawRect(219, 234, 15, 30);
	}
}

// <applet height="410" width="270" code="DrawARobotUsingApplet.java"></applet>