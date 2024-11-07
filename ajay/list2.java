import java.awt.*;
import java.applet.*;
public class list2 extends Frame
{
	String msg = " ";
	List l;
	list2(String s)
{
	setLayout(null);
	setVisible(true);
	setSize(300,300);
l = new List(2,false);
l.add("java");
l.add("c++");
l.add("kkk");
l.setBounds(100,100,70,35);
add(l);
}
public static void main(String[] args) {
	list2 e =new list2("");
}
}
