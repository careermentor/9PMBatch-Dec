package testpkg;

public class QA3 extends QA1
{

	
	
	public void mul(int a, int b)
	{
		int c = a*b;
		System.out.println("mult of a&b: " + c);
	}
	
	public static void main(String[] args) {
		QA3 q3 = new QA3();
		q3.sum(20, 30);
		//q3.subs(50, 30);
		q3.mul(20, 30);
		
		
		
	}
	
	
	
}
