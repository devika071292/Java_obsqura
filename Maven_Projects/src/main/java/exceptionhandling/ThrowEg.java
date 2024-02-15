package exceptionhandling;

public class ThrowEg {

	public void eligiblity(int age)
	{
		if (age >18)
		{
			System.out.println("Eligible for Voting");
		}
		else
		{
			throw new ArithmeticException("Not Eligible for Voting");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowEg obj  =new ThrowEg();
		obj.eligiblity(17);
	}

}
