package collectionStudy;

import java.util.ArrayList;

public class ArrayListUse {

	public static void main(String[] args) 
	{
		ArrayList<Object> a1 = new ArrayList<>();
		//a1.add(2, 22);
		a1.add("Rushi");
		a1.add("r");
		a1.add(2, "R");
		a1.add(2, "R");
		a1.add(2, 22);
		
		System.out.println(a1);
		Object a2 = a1.clone();
		System.out.println(a2);
		a1.clear();
		System.out.println(a1);
		System.out.println(a2);
		
		ArrayList<Integer> num = new ArrayList<>();
		num.add(1);
		num.add(1,3);
		num.add(null);
		num.add(10);
		num.add(11);
		num.add(36);
		num.add(46);
		System.out.println(num.size());
		
		ArrayList<Character> charac = new ArrayList<>();
		charac.add('r');
		charac.add('a');
		System.out.println(charac);
		System.out.println(num);
		System.out.println(num.contains(2));
		System.out.println(a1.isEmpty());
		

	}

}
