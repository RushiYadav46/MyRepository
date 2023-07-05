package collectionStudy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TraversingUse {

	public static void main(String[] args) 
	{
		ArrayList<Integer> num = new ArrayList<>();
		num.add(1);
		num.add(1,3);
		num.add(null);
		num.add(10);
		num.add(11);
		num.add(36);
		num.add(46);
		System.out.println(num.size());
		System.out.println(num.remove(1));//this will return value that has removed here it is 3
		System.out.println(num);
		
		System.out.println("=============using each for loop===============");
		
		for(Integer a:num) {
			
			System.out.println(a);
		}
		System.out.println("============using Iterator============");
		
		Iterator<Integer> it = num.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("============using listIterator============");
		
		ListIterator<Integer> lt = num.listIterator();
		while(lt.hasNext())
		{
			System.out.println(lt.next());
		}

	}

}
