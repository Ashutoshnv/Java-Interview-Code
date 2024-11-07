import java.awt.*;
class MyFrame extends Frame
{
   String msg ="";
   Choice c;
   MyFrame(String s)
   {
   	setLayout(null);
   	setVisible(true);
   	setSize(300,300);
   	c=new Choice();
   	c.add("Sunday");
   	c.add("tuesday");
   	c.add("Wednesday");
   	c.add("Thuresday");
   	c.add("Friday");
   	c.add("Saturday");
   	c.setBounds(100,100,100,100);
   	add(c);
   }
   	public static void main(String[] args) 
   	{
   		MyFrame f = new Week();
   	}
   }
