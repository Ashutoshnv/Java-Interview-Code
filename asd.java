import java.awt.*;
import java.applet.*;
//<applet code = "asd" width = 400 height = 300></applet>
public class asd extends Applet{
	public void init(){
		TextField tf = new TextField();
		TextArea ta = new TextArea();
		Scrollbar s = new Scrollbar();
		setLayout(new FlowLayout());
		add(tf);
		add(ta);
		add(s);
	}
}
