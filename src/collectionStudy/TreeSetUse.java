package collectionStudy;

import java.util.TreeSet;

public class TreeSetUse {

	public static void main(String[] args) 
	{
		TreeSet<Object> ts1 = new TreeSet<>();
		ts1.add(10);
		ts1.add(20);
		ts1.add(8);
		//ts1.add(null); //adding null value which is not supported by tree set it Will throw "NullPointException"
		ts1.add(9);
		ts1.add("Rushi");//this will throw a ClassCastException cause we can store only one type of data in treeSet
		
		System.out.println(ts1);
		
		ts1.clear();

	}

}
