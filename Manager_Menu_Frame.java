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

public class Manager_Menu_Frame extends JFrame
{
	private JButton add_emp_ac,remove_emp_ac,edit_ac,loan_apprv,ac_apprv,trnsc_apprv,logout;
	private JLabel l,l1,l2,l3,l4,l5,l6,l7;
	private JPanel jp1,jp2,jp3,jp4,jp5,jp6,jp7;
	Manager_Menu_Frame(String s)
	{
		super(s);
		
		Container c=getContentPane();
		  c.setLayout(new GridLayout(16,2));
		  
		add_emp_ac=new JButton("Add  New Employee account");
		add_emp_ac.addActionListener((e) ->
        {
       	   newEmployee();
            }
         );
		
		remove_emp_ac=new JButton("Remove Employee account");
		remove_emp_ac.addActionListener((e) ->
        {
       	   removeEmployee();
            }
         );
		
		loan_apprv=new JButton("       Loan Sanction          ");
		loan_apprv.addActionListener((e) ->
        {
       	   loanSanction();
            }
         );
		
		ac_apprv=new JButton("               New Account Approval             ");
		ac_apprv.addActionListener((e) ->
        {
       	   newAccount();
            }
         );
		
		trnsc_apprv=new JButton("              Transaction Approval           ");
		trnsc_apprv.addActionListener((e) ->
        {
       	   transactionApproval();
            }
         );
		
		edit_ac=new JButton("Change ID / PASSWORD");
		edit_ac.addActionListener((e) ->
        {
       	   editIdPass();
            }
         );
		
		logout=new JButton("    Sign Out    ");
		logout.addActionListener((e) ->
        {
       	   logOut();            }
         );
		
		l=new JLabel();
		
		l1=new JLabel();
		jp1=new JPanel();
		jp1.add(add_emp_ac);
		l2=new JLabel();
		jp2=new JPanel();
		jp2.add(remove_emp_ac);
		l3=new JLabel();
		jp3=new JPanel();
		jp3.add(loan_apprv);
		l4=new JLabel();
		jp4=new JPanel();
		jp4.add(ac_apprv);
		l5=new JLabel();
		jp5=new JPanel();
		jp5.add(trnsc_apprv);
		l6=new JLabel();
		jp6=new JPanel();
		jp6.add(logout);
		
		c.add(l);
		c.add(l1);c.add(jp1);
		c.add(l2);c.add(jp2);
		c.add(l3);c.add(jp3);
		c.add(l4);c.add(jp4);
		c.add(l5);c.add(jp5);
		c.add(l6);c.add(jp6);
		
		setSize(400,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setResizable(true);
		setLocation(400,100);
		 
	}
	
	public void transactionApproval()
	{
		
	}
	
	public void newAccount()
	{
		
	}
	
	public void loanSanction()
	{
		
	}
	
	public void removeEmployee()
	{
		
	}
	
	public void newEmployee()
	{
		new Create_Employee_Acc_Frame("New Employee Registration");
	}
	
	public void editIdPass()
	{
		
	}
	
	public void logOut()
	{
		new LoginFrame("Login Screen");
		this.dispose();
	}
	
	public static void main(String[] args)
	{
		new Manager_Menu_Frame("Manager Menu");
	}

}
