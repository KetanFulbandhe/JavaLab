package mypack;
public class LoginBean
{
	
//	boolean temp = false;
	public boolean validate(String name, String pass)
	{
		
		if(name.equalsIgnoreCase("ketan") && pass.equalsIgnoreCase("123"))
		{
		return true;
		}
		return false;
		
	}
}