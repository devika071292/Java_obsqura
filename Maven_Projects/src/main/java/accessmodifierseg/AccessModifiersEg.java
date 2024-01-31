package accessmodifierseg;

public class AccessModifiersEg extends AccessModifiersEgClass
{
	public void display_pub()
	{
		System.out.println("Hello world Public");
	}
	private void display_pvt()
	{
		System.out.println("Hello world Private");
	}
	protected void display_protct()
	{
		System.out.println("Hello world Protected");
	}
	void display()
	{
		System.out.println("Hello world ");	
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		AccessModifiersEg obj =new AccessModifiersEg();
		obj.display_pub();
		obj.display_pvt();
		obj.display_protct();
		obj.display();
		obj.disp_pub();
		obj.disp_protct();
		obj.disp();
		//obj.disp_pvt();

	}

}
