import java.awt.*;  
public class MenuDemo extends Frame
{
public static void main(String args[])
{
MenuDemo m= new MenuDemo();
m.setVisible(true);
MenuBar mbr= new MenuBar();
m.setMenuBar(mbr);
 Menu filemenu = new Menu("File");
 Menu editmenu = new Menu("Edit");
 Menu viewmenu = new Menu("View");
mbr.add(filemenu);
mbr.add(editmenu);
MenuItem new1= new MenuItem("New");
MenuItem open1= new MenuItem("Open");
filemenu.add(new1);
filemenu.add(open1);
}
}
