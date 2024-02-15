package finaleg;

public class FinalClass1 extends FinalClassEg   {
	final int a =25;
	//final int a;
	//public FinalClass1()
	//{
	//	a=10;
	//}
	
	public void display()
	{
		
		super.printeg();
		System.out.println(a);
		//a=10;not possible
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FinalClass1 obj = new FinalClass1();
		obj.display();

	}

}
