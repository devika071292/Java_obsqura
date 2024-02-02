package polymorphism;

public class Poly2 extends Poly1  {
	public void display(String S)
	{
		super.display("Hii");
		this.S=S;
		System.out.println(S);
	}
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		Poly2 obj1 =new Poly2();
		obj1.display("Hello World");
		
	}

}
