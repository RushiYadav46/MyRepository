package practice;

public class PerfectNumber {

	public static void main(String[] args) 
	{
		// perfect number, a positive integer that is equal to the sum of its proper divisors.
		

	int value = 6;
	int add = 0;
	for(int i=1; i<value; i++){
		if(value%i==0){
			add = i + add;
		}
	}
	if(add == value)
	{
		System.out.println("Its a Perfect number! ");
	}
	else{
		System.out.println("Its NOT a Perfect number! ");
	}

	}

}
