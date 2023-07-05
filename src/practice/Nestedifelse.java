package practice;

public class Nestedifelse {

	public static void main(String[] args)
	{
	//Program for user name and password using Nested if else
		
		String username="Rushi";
		String pass="RY123";
		
		if(username=="Rushi")
		{
			if(pass=="RY123")
			{
				System.out.println("Login Successful! ");
				System.out.println("Welcome Rushi ! ");
			}
			else {
				System.out.println("Incorrect Password ");
			}
		}
		else {
			System.out.println("Icorrect Username ");
		}

	}

}
