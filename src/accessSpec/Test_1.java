package accessSpec;

public class Test_1 {

	public static void main(String[] args) 
	{
		Test_1 as = new Test_1();
		as.Public_AS();
		as.Default_AS();
		as.Protecded_AS();
		as.Private_AS();

	}
	
	public void Public_AS()
	{
		System.out.println("Its a PUBLIC access specifier");
	}
	
	void Default_AS()
	{
		System.out.println("Its a DEFAULT access specifier");
	}
	
	protected void Protecded_AS()
	{
		System.out.println("Its a PROTECTED access specifier");
	}
	
	private void Private_AS()
	{
		System.out.println("Its a PRIVATE access specifier");
	}

}
