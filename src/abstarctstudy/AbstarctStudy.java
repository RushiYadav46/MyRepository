package abstarctstudy;

public abstract class AbstarctStudy {

	public static void main(String[] args) 
	{
		ConcreteStudy a = new ConcreteStudy();
		
		a.sample_2();

	}
	
	
	public void sample_2()
	{
		System.out.println("This is not a abstract method ");
	}
	

}
