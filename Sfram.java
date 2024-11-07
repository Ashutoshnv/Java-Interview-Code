import java.awt.*;
public class Sfram extends Frame
{
	Checkbox c1,c2;
	String msg;
	Sfram()
	{
		//setLayout(null);
		//setVisible(true);
		//setSize(300,300);
		c1=new Checkbox("java",false);
		c1.setBounds(100,100,50,50);
		add(c1);
		c2=new Checkbox("C++",false);
		c2.setBounds(100,200,50,50);
		add(c2);
		setLayout(null);
		setVisible(true);
		setSize(600,600);
	}
	public static void main(String[] args) {
		Sfram f =new Sfram();
	}
}