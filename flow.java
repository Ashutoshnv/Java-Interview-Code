import java.awt.*;
import java.applet.*;
//<applet code = "flow" width = 400 height = 300></applet>
public class flow extends Applet{
	public void init(){
		Button a = new Button("ok");
		Button b = new Button("cancel");
		Button c = new Button("exit");
		setLayout(new FlowLayout(FlowLayout.RIGHT));
		add(a);
		add(b);
		add(c);
	}
}
