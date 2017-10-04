package banking;


import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Create_Employee_Acc_Frame extends JFrame
{
	  private JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15;
	  private JTextField tname,temailid,tmobno,tfname;
	  private JTextArea tadd;
	  private JComboBox day,month,year;
	  private JRadioButton rmale,rfemale;
	  private JButton bregister,bshowall, bsearch, bupdate,bclearall,bdelete;
	
 ArrayList<Create_Employee_Acc> accountantList;
	  
      Create_Employee_Acc r;
	
			
	  public Create_Employee_Acc_Frame(String title)
	  {
		  super(title);
	  
		  Container c=getContentPane();
		  c.setLayout(new GridLayout(16,2));
		 tname = new JTextField(20);
		  temailid = new JTextField(20);
		  tmobno = new JTextField(20);
		  
		  tfname=new JTextField(20);
		  
		  
		  tadd=new JTextArea(5,20);
		  JScrollPane tapan=new JScrollPane(tadd);
				
		  	 				
		  rmale=new JRadioButton("Male");
		  rfemale=new JRadioButton("Female");
		 
		   ButtonGroup rgroup=new ButtonGroup();
		   rgroup.add(rmale);
		   rgroup.add(rfemale);
		   
		   JPanel gpanel=new JPanel();
		   gpanel.add(rmale);
		   gpanel.add(rfemale);
				
		   String dvalue[]=new String[31];
		   for(int i=0;i<=30;i++)
		   {
				dvalue[i]=String.valueOf(i+1);
		   }
		   day=new JComboBox(dvalue);
				
		   String mvalue[]=new String[12];
		   for(int i=0;i<=11;i++)
		   {
				mvalue[i]=String.valueOf(i+1);
		   }
		   month=new JComboBox(mvalue);
				
		   String yvalue[]=new String[76];
		   int cnt=0;
		   for(int i=1940;i<=2015;i++)
		   {
				yvalue[cnt]=String.valueOf(i);
				cnt++;	
		   }
		   year=new JComboBox(yvalue);
		
		    JPanel cpanel=new JPanel();
		    cpanel.add(day);
			cpanel.add(month);
			cpanel.add(year);
			
				
			bregister =new JButton("Register");
			bregister.addActionListener((e) ->
	        {
	       	   registerAccountant();
	            }
	         );
							
			bclearall = new JButton("Reset All");
			bclearall.addActionListener((e) ->
	        {
	       	   resetFrame();
	            }
	         );
		

			
			
			l1=new JLabel("REGISTRATION");
			
				
			
			
						
			l13=new JLabel("Enter Accountant's Name");
			
			l8=new JLabel("Father's Name");
					
			l14=new JLabel("Enter EmailId");
						
			l15=new JLabel("Enter Mob No");
							
			l4=new JLabel("Enter Address");
										
			l6=new JLabel("Select Gender");
							
			l7=new JLabel("Select DOB");
			
			c.add(l1);c.add(new JLabel(""));
			
			c.add(l13);c.add(tname);
			c.add(l8);c.add(tfname);
			c.add(l14);c.add(temailid);
			c.add(l15);c.add(tmobno);
			c.add(l4);c.add(tapan);
			c.add(l6);c.add(gpanel);
			c.add(l7);c.add(cpanel);
			
			c.add(bregister);
			c.add(bclearall);
		                
		    		                
			 setSize(450, 600);
			 setLocation(200,200);
			 setResizable(false);
			 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			 setVisible(true);	
	   }
	  
	  public void registerAccountant()
	    {
 	     int idfoundpos = Search_Accountant_Id.searchId(temailid.getText().trim());
         	
         	if(idfoundpos >= 0)
         	{
         	   JOptionPane.showMessageDialog(this, "ID ALREADY EXIST..PLEASE ENTER ANOTHER ID...");
         	}
         	else
         	{
         		   createRegObj();
         	       
         		   int con=JOptionPane.showConfirmDialog(this, "Are You Sure to Register?");
  			       if(con==JOptionPane.YES_OPTION)
  			       {
  				      accountantList = Accountant_List_File.readDataFromFile();
  				      accountantList.add(r);
  				    Accountant_List_File.writeDatatoFile(accountantList);
  				      JOptionPane.showMessageDialog(this, "Registration Successful...");
  				    
  				      resetFrame();
  			       }
         	 }
		  
	   	 this.dispose();
		    }
	  public void createRegObj()
	   {
		    String name,emailid,mobno,add,gn,dob,father;
			
			
			name = tname.getText().trim();
			emailid = temailid.getText().trim();
			mobno = tmobno.getText().trim();
			add=tadd.getText().trim();
			father=tfname.getText().trim();

			
			gn="";
			if(rmale.isSelected())
			{
				gn="Male";
			}
			else if(rfemale.isSelected())
			{
				gn="Female";
			}
			
			String d=(String)day.getSelectedItem();
			String m=(String)month.getSelectedItem();
			String y=(String)year.getSelectedItem();
			dob=d + "-" + m + "-" + y;
			
			
			
			r=new Create_Employee_Acc(name,father,emailid,mobno, add, gn, dob);
		 }
	
	  public void resetFrame()
	    {
	   	 this.dispose();
	   	 new Create_Employee_Acc_Frame("New Employee Registration");
	    }
	  
        public static void main(String[] args) 
	    {
		  new Create_Employee_Acc_Frame("New Employee Registration");
	    }
}
