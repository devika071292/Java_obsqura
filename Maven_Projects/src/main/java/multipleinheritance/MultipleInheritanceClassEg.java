package multipleinheritance;

public class MultipleInheritanceClassEg implements MultipleInterface1,MultipleInterface2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleInheritanceClassEg obj =new MultipleInheritanceClassEg();
		obj.add();
		obj.sum();
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		int sum = a+b;
		System.out.println("Multiple Inheritance");
		System.out.println("Sum "+sum);
		
	}

	@Override
	public void sum() {
		// TODO Auto-generated method stub
		int sum = c+d;
		System.out.println("Sum "+sum);
		
	}

}
