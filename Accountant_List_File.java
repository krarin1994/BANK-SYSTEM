package banking;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Accountant_List_File
{
	public static ArrayList<Create_Employee_Acc> readDataFromFile()
	{
		ArrayList<Create_Employee_Acc> accountantList;
		try
		{
		   FileInputStream fin=new FileInputStream("RegistrationInfo.dat");
		   ObjectInputStream oin=new ObjectInputStream(fin);
		   accountantList=(ArrayList<Create_Employee_Acc>)oin.readObject();
		   
		   oin.close();
		   fin.close();
		}catch(Exception e)
		 {
			accountantList=new ArrayList<Create_Employee_Acc>();
		 }
		 
		return accountantList;
	}
	
	public static void writeDatatoFile(ArrayList<Create_Employee_Acc> wlist)
	{
		try	
		 {
		       FileOutputStream fout=new FileOutputStream("AccountantList.dat");
		       ObjectOutputStream oout=new ObjectOutputStream(fout);
		       oout.writeObject(wlist);
		       
		       oout.close();
		}catch(Exception e){System.out.println(e);}
	}
}