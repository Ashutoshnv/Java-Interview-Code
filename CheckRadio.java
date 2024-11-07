import java.awt.*;
import java.applet.*;
import javax.swing.*; 
class CheckRadio extends Applet{
	public void init(){
		Checkbox a = new Checkbox("Checkbox 1");
		a.setBounds(100,100, 50,50);
		Checkbox b = new Checkbox("Checkbox 2");
		CheckboxGroup g = new CheckboxGroup();
		Checkbox c = new Checkbox("Radio Button 1",g,true);
		Checkbox d = new Checkbox("Radio Button 2",g,false);
		add(a);
		add(b);
		add(c);
		add(d);
	}
}
//<applet code="CheckRadio" width=600 height=400></applet>
