package interfaceStudy;

public class ImpleClass implements Test_1, Test_2
{

	public static void main(String[] arg) 
	{
		ImpleClass i = new ImpleClass();
		i.sample_1();
	}
	@Override
	public void sample_1() {
		
		Test_1.super.sample_1();
		Test_2.super.sample_1();
	}

}
