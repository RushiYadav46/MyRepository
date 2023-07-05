package practice;

import java.util.Arrays;

public class CharOccurance {

	public static void main(String[] args) 
	{
		// Program to calculate character occurrence in 

		String demo = "Hiii I am sooo Happy";
		int occ_a = demo.length() - demo.replaceAll("a", "").length();
		System.out.println("Occurance of 'a' = "+occ_a);

		// Program for find duplicate word in string
		
		String b = "Hi Hi How are you you";
		String[] inputArr = b.split(" ");
		Arrays.sort(inputArr);
		System.out.println(inputArr);
		
		for(int i=0; i<inputArr.length; i++)
		{
			if(inputArr[i]==inputArr[i+1])
			{
				System.out.println(inputArr[i]);
			}
		}
	}

}
