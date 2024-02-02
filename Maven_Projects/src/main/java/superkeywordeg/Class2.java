package superkeywordeg;

public class Class2 extends Class1
{
	public void divisiblitytest()
	{
	int sum = super.sum(15,25);
	if (sum%10 ==0)
	{
		System.out.println(sum+" is Divisible by 10");
	}
	else
	{
		System.out.println(sum+" is not Divisible by 10");
	}
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		 Class2 obj =new  Class2();
		 obj.divisiblitytest();

	}

}
