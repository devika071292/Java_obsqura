package exceptionhandling;

public class ExceptionHandlingEg {
	public static void display()
	{
		int a =5;
		int b =0;
		try
		{
		int c= a/b;		
		System.out.println("c"+c);
		}
		catch(Exception e)
		{
			System.out.println("Arithematic error");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ExceptionHandlingEg.display();
	}

}
