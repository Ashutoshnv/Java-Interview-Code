import java.awt.*;  
class MenuExample  
{  
     MenuExample(){  
         Frame f= new Frame("Menu and MenuItem Example");  
         MenuBar mb=new MenuBar();  
         Menu file=new Menu("File");
         Menu edit=new Menu("Edit");
         Menu help=new Menu("Help");
         Menu exit=new Menu("Exit");
        // Menu submenu=new Menu("Sub Menu");  
         MenuItem i1=new MenuItem("New");  
         MenuItem i2=new MenuItem("Open");  
         MenuItem i3=new MenuItem("Save");  
         MenuItem i4=new MenuItem("cut");  
         MenuItem i5=new MenuItem("copy");
         MenuItem i6=new MenuItem("past");  
         file.add(i1);  
         file.add(i2);  
         file.add(i3);
         edit.add(i4); 
         edit.add(i5);
         edit.add(i6); 
         //submenu.add(i4);  
         //submenu.add(i5);  
        // menu.add(submenu);  
         mb.add(file); 
         mb.add(edit);
         mb.add(help);
         mb.add(exit); 
         f.setMenuBar(mb);  
         f.setSize(400,400);  
         f.setLayout(null);  
         f.setVisible(true);  
}  
public static void main(String args[])  
{  
new MenuExample();  
}  
}  