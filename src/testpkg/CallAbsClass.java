package testpkg;

public class CallAbsClass extends AbsClass
{

	
	public void meth2() 
	{
		System.out.println("this is my credential");
		
	}

	public static void main(String[] args) {
		
		CallAbsClass abc = new CallAbsClass();
		abc.meth1();
		abc.meth2();
	}
	
}
