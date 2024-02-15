package collectioneg;
import java.util.*;  
public class GenericCollectionEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> obj = new ArrayList<String>();//Creating arraylist   Non primitive class
		obj.add("Cat");
		obj.add("Dog");
		obj.add("Lion");
		obj.add("Tiger");
		obj.add("Cat");
		System.out.println("Animals list " + obj);
		int s1 = obj.size();
		System.out.println("size  " + s1);
		ArrayList<Integer> obj1 = new ArrayList<Integer>();//Creating arraylist  Non primitive class
		obj1.add(2);
		obj1.add(4);
		obj1.add(6);
		obj1.add(8);
		obj1.add(10);
		obj1.add(4);
		System.out.println("Number List  " + obj1);
		obj1.remove(2);
		System.out.println("Number List  " + obj1);
		int s = obj1.size();
		System.out.println("size  " + s);
		obj1.addAll(obj1);//to add another list
		System.out.println("Number List  " + obj1);
		System.out.println("contains value 10 in array  " + obj1.contains(10));
		System.out.println("get at index 1   "+ obj1.get(1));
		

	}

}
