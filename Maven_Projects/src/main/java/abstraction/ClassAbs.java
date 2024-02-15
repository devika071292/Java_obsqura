package abstraction;

public class ClassAbs extends AbstractClass {
	public void output()
	{
		
		super.sum();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassAbs obj = new ClassAbs();
		obj.display();
		obj.output();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Hello WOrld");
		
	}

}
