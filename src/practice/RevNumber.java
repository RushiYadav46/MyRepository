package practice;

public class RevNumber {

	public static void main(String[] args) 
	{
		// program to reverse string with numbers
		
		int num = 73412;
		//String snum[] = num.split(num);
		//System.out.println(num.split(num));
		
		int a=0;
		int b;
		while(num>0) 
		{
			b = num%10;
			a= a + b;
			
		}
		System.out.println(a);

	}

}
