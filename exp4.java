import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class exp4{
	exp4(){
		JFrame f = new JFrame("Hello");
		JPanelp[] = new JPanel[3];
		String s[] = {"Cities","Colours","Flavours"};
		String c[] = {"Mumbai","Kolkata","Delhi","Bangalore"};
		String co[] = {"Red","Green","Blue"};
		String fa[] = {"Vanilla","Chocolate","Strawberry"};
		for(int i=0;i<3;i++)
			p[i] = new JPanel();
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		f.setSize(400,400);
		f.setLayout(new FlowLayout());
		for(int i=0;i<4;i++)
			p[0].add(new JButton(c[i]));
		for(int i=0;i<3;i++)
			p[1].add(new JCheckBox(co[i]));
		JComboBox<String> j = new JComboBox<>(fa);
		p[2].add(j);
		JTabbedPane t = new JTabbedPane();
		for(int i=0;i<3;i++)
			t.addTab(s[i],p[i]);
		f.add(t);
		f.setVisible(true);
	}
	public static void main(String []args){
		newexp4();
	}}
