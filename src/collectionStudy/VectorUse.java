package collectionStudy;

import java.util.Enumeration;
import java.util.ListIterator;
import java.util.Vector;

public class VectorUse {

	public static void main(String[] args) 
	{
		Vector<Object> v1 = new Vector<>();
		v1.add(null);
		v1.add(11);
		v1.add(20);
		v1.add(30);
		v1.add("Rushi");
		v1.add('M');
		v1.add(0.99f);
		
		System.out.println(v1.capacity()); //capacity is available spaces
		System.out.println(v1.size()); //size is nothing but occupied spaces
		
		System.out.println("==========Travesing by using list iterator");
		ListIterator<Object> lt1 = v1.listIterator();
		while(lt1.hasNext())
		{
			System.out.println(lt1.next()+",");
		}
		
		System.out.println("=========Traversing by using for each loop");
		
		for(Object f:v1) {
			System.out.println(f);
		}
		
		Object v2 = v1.clone();
		//v1.clear();
		System.out.println(v1.isEmpty());
		System.out.println(v2);
		System.out.println("=========Traversing by using enumeration");
		Enumeration<Object> e1 = v1.elements();
		while(e1.hasMoreElements())
		{
			System.out.println(e1.nextElement());
		}
		v1.add("M");
		
		System.out.println(v1.lastIndexOf("M"));//It finds index of last element if they are duplicated
		
		

	}

}
