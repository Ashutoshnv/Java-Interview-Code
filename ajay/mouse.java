import java .awt.*;
import java.awt.event*;
import java.applet.*;
/*<applet code="mouse" width=300 height=100></applet>*/

public class mouse extends Applet implements MouseListener,MouseMotionListener
{
String msg="";
int mouse X=0,mouse Y=0;
public void init()
{
	addMouseListener(this);
	addMouseMotionListener(this);
}
public void mouseClicked(MouseEvent me)
{
mouse X=0;
mouse Y=10;
msg="Mouse Clicked";
repaint();
}
public void mouseDragged(MouseEvent me)
{
mouse X=me.getX();
mouse Y=me.getY();
msg="*";
showStatus("Dragging mouse at"+mouse X+","+mouse Y);
repaint();
}
Public void paint(Graphics g)
{
g.drawString(msg,mouse X,mouse Y);
}
}
