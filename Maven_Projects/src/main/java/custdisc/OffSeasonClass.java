package custdisc;
import java.util.Scanner;


public class OffSeasonClass extends OnSeasonClass {
	double  discoff;
	public void discount (double price)
	{
		discoff =15.0/100.0*price;
		double total = price -discoff;
		System.out.println("*****Bill*****");
		System.out.println("*****Off Season discount applied*****");
		System.out.println("Price : " + price);
		System.out.println("Off Season discount  : 15% " );
		System.out.println("Discount : " +discoff );
		System.out.println("Amount Payable :  "+total);
		
	}
	public void disc(String opt)
	{
	if (opt.equals("on"))
	{
		super.discount(1500d);
	}
	else if (opt.equals("off"))
	{
		discount(1500d);
	}
	else
	{
		System.out.println("Wrong Choice");
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("On Season :on");
		System.out.println("Off Season :off");
		System.out.println("Enter your choice : on/off");
		String option = sc.nextLine();
		OffSeasonClass obj = new OffSeasonClass();
		obj.disc(option);
		
	}

}
