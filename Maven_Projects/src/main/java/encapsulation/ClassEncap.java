package encapsulation;

public class ClassEncap 
{

	private int a,b,sum;
	public void setter (int a,int b)
	{
		this.a=a;
		this.b=b;
		sum=a+b;
		
	}
	public void getter()
	{
		System.out.println("Sum of "+a+"&"+b+ "="+sum);
	}
}
