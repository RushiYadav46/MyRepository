package stringStudy;

public class StringMethods {

	public static void main(String[] args) 
	{
		String a = "Rushikesh";
		int x =a.length();
		String y = a.toUpperCase();
		String z =a.toLowerCase();
		System.out.println(x+y+z);
		System.out.println(a.indexOf('s'));
		System.out.println(a.lastIndexOf('s'));
		String m =a.replaceAll("Rushikesh", "");
		System.out.println(m.isEmpty());
		
		System.out.println(a.substring(1, 5));
		
		
	}

}
