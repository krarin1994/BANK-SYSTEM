package banking;

import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.ButtonGroup;

public class Accountant_Menu_Frame extends JFrame
{
	private JButton add_cus_ac,edit_cus_ac,remove_cus_ac,view_det_ac,deposit,withdraw,logout;
	private JLabel l,l1,l2,l3,l4,l5,l6,l7;
	private JPanel jp1,jp2,jp3,jp4,jp5,jp6,jp7;
	Accountant_Menu_Frame(String s)
	{
		super(s);
		
		Container c=getContentPane();
		  c.setLayout(new GridLayout(16,2));
		  
		add_cus_ac=new JButton("Add  New Customer account");
		add_cus_ac.addActionListener((e) ->
        {
        	newAccount();
            }
         );
		
		edit_cus_ac=new JButton("Edit New Customer account");
		edit_cus_ac.addActionListener((e) ->
        {
       	   editAccount();
            }
         );
		
		remove_cus_ac=new JButton("Remove Customer account");
		remove_cus_ac.addActionListener((e) ->
        {
       	   removeAccount();
            }
         );
		
		view_det_ac=new JButton("Customer Account Details");
		view_det_ac.addActionListener((e) ->
        {
       	   accountDetails();
            }
         );
		
		deposit=new JButton("               Deposit             ");
		deposit.addActionListener((e) ->
        {
       	   depositMoney();
            }
         );
		
		withdraw=new JButton("              Withdraw           ");
		withdraw.addActionListener((e) ->
        {
       	   withdrawMoney();
            }
         );
		
		logout=new JButton("Sign Out");
		logout.addActionListener((e) ->
        {
       	   logOut();
            }
         );
		
		l=new JLabel();
		
		l1=new JLabel();
		jp1=new JPanel();
		jp1.add(add_cus_ac);
		l2=new JLabel();
		jp2=new JPanel();
		jp2.add(edit_cus_ac);
		l3=new JLabel();
		jp3=new JPanel();
		jp3.add(remove_cus_ac);
		l4=new JLabel();
		jp4=new JPanel();
		jp4.add(view_det_ac);
		l5=new JLabel();
		jp5=new JPanel();
		jp5.add(deposit);
		l6=new JLabel();
		jp6=new JPanel();
		jp6.add(withdraw);
		l7=new JLabel();
		jp7=new JPanel();
		jp7.add(logout);
		
		c.add(l);
		c.add(l1);c.add(jp1);
		c.add(l2);c.add(jp2);
		c.add(l3);c.add(jp3);
		c.add(l4);c.add(jp4);
		c.add(l5);c.add(jp5);
		c.add(l6);c.add(jp6);
		c.add(l7);c.add(jp7);
		
		setSize(400,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setResizable(true);
		setLocation(400,100);
		 
	}
	
	public void newAccount()
	{
		new Create_New_Acc_Frame("New User Registration");
	}
	
	public void editAccount()
	{
		
	}
	
	public void removeAccount()
	{
		
	}
	
	public void accountDetails()
	{
		
	}
	
	public void depositMoney()
	{
		
	}
	
	public void withdrawMoney()
	{
		
	}
	
	public void logOut()
	{
		new LoginFrame("Login Screen");
	}
	
	public static void main(String[] args)
	{
		new Accountant_Menu_Frame("Accountant Menu");
	}
}
