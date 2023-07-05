package CondState;

public class CondStattments {

	public static void main(String[] args) 
	{
	//If temp is less than 0 its cool
		int temp=-1;
		if(temp<0)
		{
			System.out.println("It is cool ");
		}
		else {
			System.out.println("It is not cool");
		}
		
		System.out.println("========================================");
		
	//If gender is M You are male
		char gender='M';
		if (gender=='M')
		{
			System.out.println("You are Male ");
		}
		
		System.out.println("========================================");
		
	//If marks Greater than 40 you are pass
		int marks = 40;
		if(marks>=40)
		{
			System.out.println("Congrats You are Pass!");
		}
		else {
			System.out.println("Sorry You are FAIL");
		}
		
	}

}
