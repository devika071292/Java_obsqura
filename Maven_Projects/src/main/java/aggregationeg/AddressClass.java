package aggregationeg;

public class AddressClass {
int houseno;
String place;
StudentClass sc;
public AddressClass(int houseno,String place,StudentClass sc)
{
	this.houseno = houseno;
	this.place  = place;
	this.sc = sc;
}
public void display_details()
{
	System.out.println("*************Student Details*************");
	System.out.println("Name : "+sc.name);
	System.out.println("Roll No : "+sc.rollno);
	System.out.println("Address :  "+ houseno+" , "+place);
}
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		StudentClass st =new StudentClass("Kevin",130);
		AddressClass obj =new AddressClass(99,"Trivandrum",st);
		obj.display_details();
		

	}

}
