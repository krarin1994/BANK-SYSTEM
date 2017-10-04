package banking;

import java.util.ArrayList;

public class Authentication
{
	public static int searchId(String id, String pass)
	{
		ArrayList<Login> list1;
		int f = -1;
		try
		{
			list1 = AuthenticateFromFile.readDataFromFile();
			
			for(int p=0; p<list1.size(); p++)
			{
				if( (id.equals(list1.get(p).getLoginId())) && (pass.equals(list1.get(p).getLoginPass())) )
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