import javax.swing.*;
import java.awt.*;
public class Demo extends JFrame
{
	public Demo()
	{
		setLayout(new FlowLayout());
		JLabel j1 = new JLabel("Name");
		add(j1);
		JTextField t1 = new JTextField(9);
		add(t1);
		setSize(800,800);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Demo();
	}
}