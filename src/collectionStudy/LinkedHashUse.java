package collectionStudy;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashUse {

	public static void main(String[] args) 
	{
		LinkedHashSet<Object> lh1 = new LinkedHashSet<>();
		lh1.add("Rushi");
		lh1.add("Yadav");
		lh1.add('R');
		lh1.add('Y');
		lh1.add("");
		lh1.add(null);
		lh1.add('R'); //duplicate value
		
		System.out.println(lh1);
		
		System.out.println("===Traversing with for each loop===");
		for(Object l:lh1) {
			System.out.println(l);
		}
		System.out.println("===Traversing with Iterator===");
		Iterator<Object> it = lh1.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	
		

	}

}
