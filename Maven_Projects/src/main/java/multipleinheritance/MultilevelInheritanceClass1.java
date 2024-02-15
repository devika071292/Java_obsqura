package multipleinheritance;

public class MultilevelInheritanceClass1 implements MultilevelInterface2
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultilevelInheritanceClass1 obj =new MultilevelInheritanceClass1();
		obj.add();
		obj.sum();
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		int sum = a+b;
		System.out.println("Multilevel Inheritance using interface");
		System.out.println("Sum "+sum);
		
	}

	@Override
	public void sum() {
		// TODO Auto-generated method stub
		int sum = c+d;
		System.out.println("Sum "+sum);
		
	}

}
