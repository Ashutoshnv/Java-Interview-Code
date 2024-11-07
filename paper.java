import java.awt.*;
import java.applet.*;
public class paper extends Applet
{
public void init()	
{
	int i,j,k,n=4;
	setLayout(new BorderLayout());
	Panel p1=new Panel();
	Panel p2=new Panel();
	p1.setLayout(new FlowLayout());
	p1.add(new TextField(20));
	p1.add(new TextField(20));
	p2.setLayout(new FlowLayout());
	p2.add(new Button("ok"));
	p2.add(new Button("Submit"));
	add(p1,BorderLayout.EAST);
	add(p2,BorderLayout.WEST);
}
}
/*<applet code=paper.class width=600 height=600> </applet>*/
