package aggregation;

public class AggregationClass2
{
String house;
int pin;
AggregationClass ac;//to refer the variables of first class
public AggregationClass2(String house,int pin,AggregationClass ac)
{
	this.house =house;
	this.pin =pin;
	this.ac =ac;
}
	public void sum()
	{
		System.out.println(ac.age+" "+ac.name);
		System.out.println(house+" "+pin);
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		AggregationClass obj1 =new AggregationClass("Sree",10);
		AggregationClass2 obj2 = new AggregationClass2("Dave",12,obj1);//to get first class object of first class is called
		obj2.sum();
	}

}
