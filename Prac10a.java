import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

class Frame1 extends Frame implements ActionListener
{
    String msg="";
    Button btnNew,btnSubmit,btnView;
    Label lblName,lblAge,lblAddr,lblGender,lblQua;
    TextField txtName,txtAge;
    TextArea txtAddr,txtAns;
    CheckboxGroup ChkGrp;
    Checkbox chkMale,chkFemale;
    Checkbox chkMca,chkBca,chkBba,chkMba;

     Frame1(String name)
    { 
        super(name);
        setLayout(new GridLayout(3,2));

        lblName = new Label("Name: ");
        lblName.setSize(100, 20);
        lblAge = new Label("Age: ");
        lblAddr = new Label("Address : ");
        lblGender = new Label("Gender: ");
        lblQua = new Label("Qualification: ");
        txtName = new TextField(20);
        txtAge = new TextField(20);
        txtAddr = new TextArea();
        ChkGrp = new CheckboxGroup();
        chkMale = new Checkbox("Male",ChkGrp,false);
        chkFemale = new Checkbox("Female",ChkGrp,false);
        chkMca = new Checkbox("Bsc.IT");
        chkBca = new Checkbox("Bsc.Cs");
        chkMba = new Checkbox("M.Tech");
        chkBba = new Checkbox("B.Tech");
        btnNew = new Button("NEW");
        btnSubmit = new Button("SUBMIT");
        btnView = new Button("VIEW");
        btnNew.addActionListener(this);
        btnSubmit.addActionListener(this);
        btnView.addActionListener(this);

        add(lblName);
        add(txtName);
        add(lblAge);
        add(txtAge);
        add(lblAddr);
        add(txtAddr);
        add(lblGender);
        add(chkMale);
        add(chkFemale);
        add(lblQua);
        add(chkBca);
        add(chkBba);
        add(chkMca);
        add(chkMba);
 
        add(btnNew);
        add(btnSubmit);
        add(btnView);
     
        txtAns = new TextArea();
        add(txtAns);
     
    } 
     
    public void actionPerformed(ActionEvent ae)
    {
        String s="";
        boolean b;
        FileInputStream Fin;
        DataInputStream dis;
        FileOutputStream Fout;
        DataOutputStream dos;
     
        try
        {
            Fout = new FileOutputStream("Biodata.txt",true);
            dos = new DataOutputStream(Fout);
     
            String str = ae.getActionCommand();
            if(str.equals("SUBMIT"))
            {
         
                s=txtName.getText().trim();
                dos.writeUTF(s);
         
                dos.writeInt(Integer.parseInt(txtAge.getText()));

                s=txtAddr.getText();
             
                dos.writeUTF(s);
                if(chkMale.getState())
                    dos.writeUTF("Male ");
                if(chkFemale.getState())
                    dos.writeUTF("Female ");

                s="";                 
                if(chkMca.getState())
                    s="Bsc.IT"; 
                             
                if(chkBca.getState())
                    s+="Bsc.Cs ";                     

                if(chkBba.getState())
                    s+="M.Tech "; 
                 
                if(chkMba.getState())
                    s+="B.Tech "; 
                 
                s+="!";
                dos.writeUTF(s);
                Fout.close();
            }
         
            if(str.equals("VIEW"))
            {
                String tmp,name,addr,gender,qual;
                int age;
                Fin = new FileInputStream("Biodata.txt");
                dis = new DataInputStream(Fin);

     
                int i=0,j;
             
                while(Fin.available()>0)
                {
                    name = dis.readUTF();
                    age  = dis.readInt();
                    addr = dis.readUTF();
                    gender = dis.readUTF();
                    qual = dis.readUTF();

                    if(name.equals(txtName.getText().trim()))
                      {
                        txtAge.setText(age+"");                 
                        txtAddr.setText(addr);
                        if(gender.equals("Male "))
                            chkMale.setState(true);
                        else
                            chkFemale.setState(true);
                        while(qual.charAt(i)!='!')
                        {
                            j=qual.indexOf(' ');
                            tmp = qual.substring(i,j);
 
                            if(tmp.equals("Bsc.IT"))
                                chkMca.setState(true);                 

                            if(tmp.equals("Bsc.Cs"))
                                chkBca.setState(true);                 

                            if(tmp.equals("M.Tech"))
                                chkBba.setState(true);                 

                            if(tmp.equals("B.Tech"))
                                chkMba.setState(true);
                            i=j+1;
                        }
                        break;
                    }
                }
                Fin.close(); 
            }

            if(str.equals("NEW"))
            {
                txtName.setText("");
                txtAge.setText("");                 
                txtAddr.setText("");
                chkMale.setState(false);
                chkFemale.setState(false);
                chkMca.setState(false);                 
                chkBca.setState(false);                 
                chkBba.setState(false);                 
                chkMba.setState(false);
            }
        }
        catch(java.lang.Exception e)
        {
            System.out.println("The Exception Is : " +e);
        }

    }

}

class Prac10a
{

    public static void main(String args[])
    {
        try
    {
        Frame1 F = new Frame1("Biodata");
        F.setSize(800,800);
        F.show();
    }
        catch(java.lang.Exception e)
        {
            System.out.println(e);
        }
    } 

}


 

 

 
 