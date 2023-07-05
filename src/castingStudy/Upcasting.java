package castingStudy;

public class Upcasting {

	public static void main(String[] args) 
	{
		NonP1 P1 = new NonP1();
		P1.a();
		P1.b();
		
		NonP2 P2 = new NonP2();
		P2.a();
		P2.b();
		
		//Up casting
		NonP1 F =new NonP2();
		F.a();
		F.b();
		

	}

}
