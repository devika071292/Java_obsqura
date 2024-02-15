package collectioneg;

import java.util.*;

public class ListEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Integer> obj = new ArrayList <Integer>();
		obj.add(1);
		obj.add(3);
		obj.add(5);
		obj.add(7);
		obj.add(1);
		System.out.println("List : "+obj);
		boolean x = obj.addAll(2, obj);
		System.out.println("List : "+obj);
		obj.remove(2);
		System.out.println("List : "+obj);
		for (Integer i :obj)
		{
			System.out.println(i);
		}
		Iterator<Integer> it= obj.iterator();//iterator
		while(it.hasNext())//iterate fwd direction
		{
			System.out.println("iterator  "+it.next());//print
		}
		
		
		

	}

}
