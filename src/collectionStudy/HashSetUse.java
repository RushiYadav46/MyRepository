package collectionStudy;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetUse {

	public static void main(String[] args) 
	{
		HashSet<Object> h1 = new HashSet<>();
		h1.add("Rushi");
		h1.add('R');
		h1.add('Y');
		h1.add(46);
		h1.add(null);
		
		System.out.println(h1);
	System.out.println("========Traversing with for each loop========");
		
		for(Object a:h1) {
			System.out.println(a);
		}
		
		System.out.println("======Traversing with Iterator======");
		
		Iterator<Object> it = h1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println(h1.size());
		System.out.println(h1.contains('R'));
		

	}

}
