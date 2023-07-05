package CondState;

public class Signals {

	public static void main(String[] args) 
	{
	//Signals Assignment
		
		String signal ="Green";
		
		if(signal=="Red")
		{
			System.out.println("STOP");
		}
		else if(signal=="Green")
		{
			System.out.println("GO");
		}
		else if(signal=="Yellow")
		{
			System.out.println("WAIT");
		}
		else {
			System.out.println("Wrong signal");
		}

	}

}
