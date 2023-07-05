package accessSpec2;

import accessSpec.Test_1;

public class Test_3 extends Test_1{

	public static void main(String[] args) 
	{
		Test_1 as3 = new Test_1();
		as3.Public_AS();
		Test_3 t3 = new Test_3(); //here we have created object of current class
		t3.Protecded_AS(); //object of sub class is used to call protected method
		t3.Public_AS();

	}

}
