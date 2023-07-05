package practice;

import java.util.Arrays;

public class DuplicateNum {

	public static void main(String[] args) 
	{
		int[] num = {5,6,10,5,12,6};
		
		//First we have to sort the array
		Arrays.sort(num);
		for(int i=0; i<num.length-1; i++) {
			
			if(num[i]==num[i+1]) {
				System.out.println("Duplicate is "+num[i]);
			}
		}

	}

}
