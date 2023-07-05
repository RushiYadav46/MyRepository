package practice;

public class ReverseString {

	public static void main(String[] args) 
	{
		String name = "Rushikesh";
		System.out.println("Original String :"+name);
		
		char a;
		String revStr = "";
		
		for(int i=0; i<name.length(); i++) {
			
			a = name.charAt(i);
			revStr = a + revStr;
		}
		System.out.println("Reverse String is :"+revStr);


	}
	}

