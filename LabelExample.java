import java.awt.*;  
class LabelExample{  
public static void main(String args[])
{  
    Frame f= new Frame("Label Example");  
    //Label l1,l2;  
    Label l1=new Label("First Label.");  
    l1.setBounds(100,100, 100,30);  
    Button b=new Button("Click Here");  
    b.setBounds(100,400,80,30);
    Checkbox checkbox1 = new Checkbox("C++");  
    checkbox1.setBounds(100,200, 50,50);  
    CheckboxGroup cbg = new CheckboxGroup();  
    Checkbox check1 = new Checkbox("C++", cbg, false);    
    check1.setBounds(100,300, 50,50);
    TextField t1=new TextField("hello Ashutosh");  
    t1.setBounds(50,500, 200,30);
    TextArea area=new TextArea("Welcome to javatpoint");  
    area.setBounds(10,70, 500,500);          
    f.add(l1);
    f.add(b);
    f.add(checkbox1);
    f.add(check1);
    f.add(t1);
    f.add(area);
    f.setSize(600,600);  
    f.setLayout(null);  
    f.setVisible(true);  
}  
}  