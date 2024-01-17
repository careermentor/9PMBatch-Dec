package testpkg;

public class StaticDemo 
{

	static int i = 30;
	public static void meth1() 
	{
	
		
		System.out.println(i);
		
	}
	
	public void meth2()
	{
		System.out.println("this is method is not static");
	}
	
	
	public static void main(String[] args) 
	{
	
		
		StaticDemo.meth1();
		
		StaticDemo sd = new StaticDemo();
		sd.meth2();
		
	}
	
}
