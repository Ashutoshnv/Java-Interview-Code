import javax.swing.*;
import java.awt.*;
public class Pick extends JApplet
{
	public void start()
	{
		Container ct =getContentPane();
		ImageIcone i =ImageIcone("india.gif");
		Jlabel j =new Jlabel("ash",i,Jlabel.CENTER);
		ct.add(j);
	}
}
/*
<applet code="Pick" width=300 hight=300>
</applet>
*/
