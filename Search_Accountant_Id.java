package banking;

import java.util.ArrayList;

public class Search_Accountant_Id
{
	public static int searchId(String id)
	{
		ArrayList<Create_Employee_Acc> accountantList;
		int f = -1;
		try
		{
		accountantList=Accountant_List_File.readDataFromFile();
			
			for(int p=0; p<accountantList.size(); p++)
			{
				if(id.equals(accountantList.get(p).getEmailid()))
				{
				   f = p;
				   break;
				}	
			}
			 
			return(f);
		}catch(Exception e)
		{
			System.out.println(e);
			return(-2);
		}
 	}
}