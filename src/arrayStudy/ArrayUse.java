package arrayStudy;

public class ArrayUse {

	public static void main(String[] args)
	{
		int a[] = new int[3];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		
		System.out.println(a[1]);
		
		
		//second method to declare a array
		String x[] = {"Tom","and","Jerry"};
		System.out.println(x[0]+" "+ x[1]+" "+ x[2]);
		
		
		//Multidimensional array
		int z[][] =new int[2][2];
		z[0][0] = 10;
		z[0][1] = 20;
		z[1][0] = 30;
		z[1][1] = 40;
		
		//Printing normally
		System.out.println(z[0][0]);
		
		//printing with for loop
		
		for(int i=0; i<=1;i++) {
			System.out.println();
			for(int j=0; j<=1; j++) {
				System.out.print("["+z[i][j]+"] ");
			}
		}
		System.out.println();
		
		//using another declaration method
		
		String name[][] = {{"Jai","Shri","Ram"},{"Jai","Shri","Krishna"}};
		System.out.println(name[0][0]);
		
		//Using for loop
		for(int i=0; i<=1;i++) {
			System.out.println();
			for(int j=0; j<=2; j++) {
				System.out.print("["+name[i][j]+"] ");
			}
		}
		
		

	}

}
