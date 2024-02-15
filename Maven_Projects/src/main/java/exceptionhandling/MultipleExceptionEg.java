package exceptionhandling;

public class MultipleExceptionEg {
	public static void display()
	{
		int x =5;
		int y =0;
		int a[] =new int[5];
		try
		{
		a[6] =12;	
		a[4] =x/y;
		
		//System.out.println("a"+a);
		}
		catch(ArithmeticException e )
		{
			System.out.println("ArithmeticException occurs");
		}
		  catch(ArrayIndexOutOfBoundsException e)  
        {  
         System.out.println("ArrayIndexOutOfBounds Exception occurs");  
        }    
		catch(Exception e)
		{
			System.out.println("Exception "+e);
		}
		finally
		{
			System.out.println("End block!!!");
		}
	}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleExceptionEg.display();
	}

}
