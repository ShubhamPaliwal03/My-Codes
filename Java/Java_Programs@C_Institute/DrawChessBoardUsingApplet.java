import java.awt.*;
import java.applet.*;

public class DrawChessBoardUsingApplet extends Applet
{
	public void paint(Graphics g)
	{
		// outer box

		g.drawRect(50,50,400,400);

		int x=50;
		int y=50;
		int w=50;
		int h=50;

		for(int j=1;j<=8;j++)
		{
			x = 50;

			for(int i=1;i<=8;i++)
			{
				if(j%2==1)
				{
					if(i%2==1)
					{
						g.drawRect(x,y,w,h);
					}
					else
					{
						g.fillRect(x,y,w,h);
					}
				}
				else
				{
					if(i%2==1)
					{
						g.fillRect(x,y,w,h);
					}
					else
					{
						g.drawRect(x,y,w,h);
					}
				}

				x+=50;
			}

			y+=50;
		}	
	}
}

// <applet height="500" width="500" code="DrawChessBoardUsingApplet.java"></applet>