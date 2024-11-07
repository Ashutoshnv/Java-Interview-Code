import java.awt.*;
class MyFrame extends Frame
{
    MyFrame()
    {
   Choice c =new Choice();
   Choice a =new Choice();
   Frame  f  = new Frame();
    a.add("Even");
    a.add("Odd"); 
   	c.add("Sunday");
   	c.add("Monday");
   	c.add("Tuesday");
   	c.add("Wednesday");
   	c.add("Thuresday");
   	c.add("Friday");
   	c.add("Saturday");
   	c.setBounds(100, 100, 100, 100);
   	f.add(a);
   	a.setBounds(100, 200, 100, 100);
   	f.add(c);
   	f.setLayout(null);
   	f.setVisible(true);
   	f.setSize(800, 800);
   }
   	public static void main(String[] args) 
   	{
   		new MyFrame();  
   	}
   }
