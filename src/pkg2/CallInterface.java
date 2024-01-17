package pkg2;

public class CallInterface implements DemoInterface
{

	public static void main(String[] args)
	{
		CallInterface ci = new CallInterface();
		ci.IM1();

	}

	
	public void IM1()
	{
		System.out.println("this is interface method");
		
	}

}
