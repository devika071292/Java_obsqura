package abstraction;

public class InterfaceEg2 implements InterfaceEg{
	public void print()
	{
	System.out.println("hi");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceEg2 obj = new InterfaceEg2();
		obj.add();
		obj.print();
		InterfaceEg obj1 = new InterfaceEg2();//interfaCE OBJECT CREATION
		obj1.add();
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		int c =a+b;
		System.out.println("Sum : "+c);
		
	}

}
