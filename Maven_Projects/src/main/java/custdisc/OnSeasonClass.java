package custdisc;

public class OnSeasonClass
{
	double  disc;
	public void discount (double price)
	{
		disc =40.0/100.0*price;
		double total = price - disc;
		System.out.println("*****Bill*****");
		System.out.println("*****On Season discount applied*****");
		System.out.println("Price : " + price);
		System.out.println("On Season discount  : 40% " );
		System.out.println("Discount : " +disc );
		System.out.println("Amount Payable :  "+total);
		
	}

}
