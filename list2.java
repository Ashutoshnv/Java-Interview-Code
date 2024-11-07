import java.awt.*;
import java.applet.*;
public class list2 extends Applet
{
public void init()	
{
   List l=new List(2,true);
   l.add("java");
   l.add("c++");
   l.add("DCC");
   add(l);	
}
}
/*<applet code=list2.class width=600 height=600> </applet>*/
