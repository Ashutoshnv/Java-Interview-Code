import java.awt.*;
public class Sfram extends Fram
{
	checkbox c1,c2;
	String msg;
	Sfram()
	{
		setLayout(null);
		setVisible(true);
		setSize(300,300);
		c1=new checkbox("java",false);
		c1=setBound(100,100,50,50);
		add(c1);
		c2=new checkbox("C++",false);
		c2=setBound(100,100,50,50);
		add(c2);
	}
	public static void main(String[] args) {
		Sfram f =new Sfram();
	}
}