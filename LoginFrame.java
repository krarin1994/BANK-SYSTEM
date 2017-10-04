package banking;

import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.ButtonGroup;

public class LoginFrame extends JFrame
{
	private JLabel l1,l2,l3,l4,l5,l6,l7;
	private JRadioButton ruser,radmin;
	private JTextField id;
	private JPasswordField pass;
	private JButton submit,reset,exit;
	LoginFrame(String s)
	{
		super(s);
		Container c=getContentPane();
		  c.setLayout(new GridLayout(11,2));
		
		l1=new JLabel();
		l2=new JLabel("USERNAME");
		l3=new JLabel();
		l4=new JLabel();
		l5=new JLabel("PASSWORD");
		l6=new JLabel();
		l7=new JLabel();
		
		JPanel jp =new JPanel();
		JPanel jp2=new JPanel();
		JPanel jp3=new JPanel();
		JPanel jp4=new JPanel();
		
		
		ruser=new JRadioButton("ACCOUNTANT");
		radmin=new JRadioButton("MANAGER");
		ButtonGroup ob=new ButtonGroup();
		
		ob.add(ruser);
		ob.add(radmin);
		
		id=new JTextField(10);
		pass=new JPasswordField(10);
		
		
		
		submit=new JButton("SUBMIT");
		submit.addActionListener((e) ->
        {
        	authenticate();
        }
		 );
		
		reset=new JButton("RESET");
		reset.addActionListener((e) ->
        {
       	   resetFrame();
            }
         );
		
		exit=new JButton("EXIT BANK");
		exit.addActionListener((e) ->
        {
        	this.dispose();
        }
		 );
	
		jp.add(ruser);
		jp.add(radmin);
		jp2.add(l2);
		jp2.add(id);
		
		jp3.add(l5);jp3.add(pass);
		jp4.add(submit);jp4.add(reset);

			
		c.add(l1);c.add(jp);
		c.add(l3);c.add(jp2);
		c.add(l4);c.add(jp3);
		c.add(jp4);c.add(l6);
		c.add(l7);c.add(exit);
		
		
			
		setSize(400,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setResizable(true);
		setLocation(400,100);
		
	}
	public void authenticate()
    {
		String managerId, managerPassword;
		managerId = "admin";
		managerPassword = "password";
		
		if(radmin.isSelected())
		{
			if((id.getText().equals(managerId)) && pass.getText().equals(managerPassword))
			{
				JOptionPane.showMessageDialog(this, "ACCESS GRANTED");
				new Manager_Menu_Frame("Manager Menu");
				this.dispose();
			}
			else
			{
	    		JOptionPane.showMessageDialog(this, "ACCES DENIED");
				resetFrame();
	    	 }
			
		}
		else if(ruser.isSelected())
		{
			int foundpos = Authentication.searchId(id.getText(),pass.getText());
	    	if(foundpos >= 0)
	    	{
	    	   JOptionPane.showMessageDialog(this, "ACCESS GRANTED");
	    	   new Accountant_Menu_Frame("Accountant Menu");
	    	   
	    	}
	    	else
	    	{
	    		JOptionPane.showMessageDialog(this, "INVALID ID");
				resetFrame();
	    	 }
		}

     }
	
	public void resetFrame()
    {
   	 this.dispose();
   	 new LoginFrame("Login Screen");
    }
	
    public static void main(String[] args)
    {
		new LoginFrame("Login Screen");
	}

}
