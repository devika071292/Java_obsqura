package collectioneg;

import java.util.*;

public class NonGenericCollectionEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList obj = new ArrayList ();
		obj.add("Cat");
		obj.add("Dog");
		obj.add("Tiger");
		obj.add(2);
		obj.add(4);
		obj.add(6);
		System.out.println("Non Generic list " + obj);
		System.out.println("size  " +obj.size());
	}

}
