import java.awt.*;
import java.applet.*;
public class LineRect extends Applet
{
	public void paint (Graphics g)
	{
		g.drawLine(10, 10, 50, 50);
		g.drawRect(10, 60, 40, 30);
		g.fillRect(60, 10, 30, 80);
		g.drawRoundRect(10, 100, 80, 50, 10, 10);
		g.drawLine(100, 10, 230, 140);
		g.drawLine(100, 140, 230, 10);
	}
}
<Applet
CODE = LineRect.class
WIDTH =250
HEIGHT = 200>
</Applet>