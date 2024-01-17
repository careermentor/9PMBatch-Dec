package testpkg;

public class Additions 
{
	
	

	public float sum()   //method without parameter/argument
	{
		int a = 20;
		float b = 30.5f;
		float c = a+b;
		System.out.println("sum of a&b: " + c);
		return c;
	}
	
	public int add(int a, int b)  //method with parameter/argument
	{
		int c = a+b;
		System.out.println("addition of a&b: " + c);
		return c;
	}
	
	
	
	
	public static void main(String[] args) {
		
		Additions add = new Additions(10,20);  //constructor will be automaticalled when we create object of the class
		add.sum();
		Additions abc = new Additions();
		
		
		int x = add.add(10, 20);
		add.add(x, 30);
		
		add.add(50, 100);
		
	}
	public Additions()
	{
		System.out.println("this is constructor with no paramter");
	}
	public Additions(int a, int b)
	{
		System.out.println("this is constructor");
		int c = a*b;
		System.out.println("multiplication of a&b: " + c);
		
	}
}
