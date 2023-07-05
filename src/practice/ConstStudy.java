package practice;

public class ConstStudy {
 //Global VAriables
	String First_name;
	String Last_Name;
	String Mid_Name;
	Float Age;

	public static void main(String[] args) 
	{
//Creating object for Constructor and Assigning values	
		
		ConstStudy c1 = new ConstStudy("Yadav", "Rushi", "Pravin", 25.2f);
		c1.infoDisplay();
		
	}
	
//Non-static regular method with uses 
	
	public void infoDisplay()
	{
		System.out.println("Your Name is = "+First_name);
		System.out.println("Last name is = "+Last_Name);
		System.out.println("Middle Name = "+Mid_Name);
		System.out.println("Your Age is = "+Age);
	}
	
//Constructor with parameter 
	
	public ConstStudy(String LN, String FN, String MN, Float A )
	{
		Last_Name = LN;
		First_name = FN;
		Mid_Name = MN;
		Age = A;
		
	}
	
	
	
		
	

}
