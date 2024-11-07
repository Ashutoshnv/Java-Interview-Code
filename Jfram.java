import java.swing.*;
import java.awt.*;
class Demo extends JFrame
{
	Demo()
	{
		setLayout(new FlowLayout());
		JLabel j1 = new JLabel("Name");
		j1.setSize(40);
		add(j1);
		JTextField t1 = new JTextField(50);
		add(t1);
		setSize(400,400);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Demo();
	}
}