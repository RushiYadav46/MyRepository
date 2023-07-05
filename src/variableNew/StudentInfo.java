package variableNew;

public class StudentInfo {

	public static void main(String[] args)
	{
		Stdinfo();
		System.out.println("==============================");
		StudentInfo SI = new StudentInfo();
		SI.Stdinfo("Rushi", 46, 'M', 22.5f);
		System.out.println("==============================");
		SI.Stdinfo("Sita", 12, 'F', 23.2f);
		System.out.println("==============================");
		SI.Stdinfo("Sham", 10, 'M', 25.3f);
		System.out.println("==============================");
	}
	//With normal method
	public static void Stdinfo()
	{
			String Name;
		int RollNum;
		char Gender;
		float Age;

		Name = "Rushikesh P. Yadav";
		RollNum = 07;
		Gender = 'M';
		Age = 24.11f;

		System.out.println("Name          = "+ Name);
		System.out.println("Roll number   = "+ RollNum);
		System.out.println("Gender        = "+Gender);
		System.out.println("Age           = "+Age);

	}
	//With parameter method
	public void Stdinfo(String name, int rollNo, char gender, float age )
	{
		System.out.println("Student Name     = "+name);
		System.out.println("Students Rollnum = "+rollNo);
		System.out.println("Students Gender  = "+gender);
		System.out.println("Students Age     = "+age);
	}

}
