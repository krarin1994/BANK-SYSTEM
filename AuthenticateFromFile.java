package banking;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class AuthenticateFromFile
{
	public static ArrayList<Login> readDataFromFile()
	{
		ArrayList<Login> list1;
		try
		{
		   FileInputStream fin = new FileInputStream("AuthenticateInfo.dat");
		   ObjectInputStream oin = new ObjectInputStream(fin);
		   list1 = (ArrayList<Login>)oin.readObject();
		   
		   oin.close();
		   fin.close();
		}catch(Exception e)
		 {
			 list1=new ArrayList<Login>();
		 }
		 
		return list1;
	}
	
}
