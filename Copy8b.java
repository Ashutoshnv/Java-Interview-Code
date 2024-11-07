import java.awt.*;
import java.awt.event.*;

class Exp9a extends Frame implements ActionListener
{
 Label l1,l2,l3;
 TextField t1;
 Button b1,b2;
 ex2()
 {
   super("Factorial of a number");
   setLayout(null);
   setSize(500,400);
   setVisible(true);
   b1=new Button("Find");
   b2=new Button("Clear");
   l1=new Label("Enter the number:");
   l2=new Label("The factorial is:");
   l3=new Label(null);
   t1=new TextField();
   l1.setBounds(100,50,120,20);
   add(l1);
   t1.setBounds(240,50,50,20);
   add(t1);
   l2.setBounds(100,80,130,20);
   add(l2);
   l3.setBounds(240,80,50,20);
   add(l3);
   b1.setBounds(200,150,50,20);
   add(b1);
   b2.setBounds(270,150,50,20);
   add(b2);
   b1.addActionListener(this);
   b2.addActionListener(this);
        Toolkit t=getToolkit();
        Dimension d=t.getScreenSize();
        int h=(int) d.getHeight();
        int w=(int) d.getWidth();
        setLocation(w/4, h/4);
   addWindowListener(new WindowAdapter()
   {
    public void windowClosing(WindowEvent we)
    {
     System.exit(0);
    }
   });
 }

 public void actionPerformed(ActionEvent ae)
 {
  int n;
  if(ae.getSource()==b1)
  {
   n=Integer.parseInt(t1.getText().trim());
   l3.setText(Integer.toString(fact(n)));
  }
  else
  {
   t1.setText(null);
   l3.setText(null);
   t1.requestFocus();
  }
 }

 int fact(int n)
 {
  int f=1;
  for(int i=1;i<=n;i++)
  {
   f=f*i;
  }
  return f;
 }

 public static void main(String s[])
 {
  ex2 ob=new ex2();
 }
}