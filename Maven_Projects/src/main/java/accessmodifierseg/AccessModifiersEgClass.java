package accessmodifierseg;

public class AccessModifiersEgClass {
	public void disp_pub()
	{
		System.out.println("Hello world Public Parent");
	}
	private void disp_pvt()
	{
		System.out.println("Hello world Private  Parent");
	}
	protected void disp_protct()
	{
		System.out.println("Hello world Protected  Parent");
	}
	void disp()
	{
		System.out.println("Hello world  Parent");	
	}

}
