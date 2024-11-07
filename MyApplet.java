import  java.awt.*;
import  java.applet.*;
public class MyApplet extends Applet 
{	
String u;	
String p;
public void init()
{	
u = getParameter("username");
p = getParameter("password");
}
public void paint(Graphics g)
{
if(p.length()>8)
{		
g.drawString("Password has more than 8 characters.",20,20);
 }
else
{
g.drawString("Password has less than 8 characters.",20,40);
}
}
}
/*
<applet code="MyApplet" height="300" width="500">
<param name="username" value="Admin"/>
<param name="password" value="Admin"/>
</applet>
*/
