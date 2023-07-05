package practice;

import java.util.Arrays;

public class SecondLargestNum {

	public static void main(String[] args) 
	{
		//Program to find second largest number in array
		
		int[] arr = {5,6,3,8,9,4,12};
		Arrays.sort(arr);
		System.out.println(arr[arr.length-2]);
	
	}

}
