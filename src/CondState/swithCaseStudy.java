package CondState;

public class swithCaseStudy {

	public static void main(String[] args) 
	{
	// Program using switch case method 
		int day=4;
		
		switch(day)
		{
		case 1:
		{
			System.out.println("It's Monday");
			break;
		}
		case 2:
		{System.out.println("Its Tuesday");
				break;
		}
		case 3:
		{System.out.println("Its Wednesday");
				break;
		}
		case 4:
		{System.out.println("Its Thursday");
				break;
		}
		case 5:
		{System.out.println("Its Friday");
		break;
		}
		case 6:
		{System.out.println("Its Saturday");
		break;
		}
		case 7:
		{System.out.println("Its Sunday Enjoy!! ");
		break;
		}
	default:
	{
		System.out.println("Please Enter Valid Day From 1 to 7");
	}
		}
	 }

	}
