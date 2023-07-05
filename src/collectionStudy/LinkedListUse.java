package collectionStudy;

import java.util.LinkedList;

public class LinkedListUse {

	public static void main(String[] args) 
	{
		LinkedList<Object> ll1= new LinkedList<>();
		ll1.add("MH");
		ll1.add(10);
		ll1.add("UP");
		ll1.add(10.5f);
		ll1.add('A');
		ll1.add('a');
		
		System.out.println(ll1);
		System.out.println(ll1.peek());
		System.out.println(ll1.size());
		ll1.set(2, "MH");
		System.out.println(ll1);
		System.out.println("======================");
		
		//To reverse the linked list
		for(int i=ll1.size()-1; i>=0; i--)
		{
			System.out.println(ll1.get(i));
		}
	}

}
