package testpkg;

public class QA2 extends QA1
{

	int x = 20;
	
	public void printval()
	{
		final int x = 30;
		//x=40;
		System.out.println(x);  //30
		System.out.println(this.x);//20
		System.out.println(super.x); //200
		
		super.sum(20, 30);
		
	}
	
	public void sum(int a, int b)
	{
		int c = a*a+b*b;
		System.out.println("sum of a&b: " + c);
	}
	
	public void subs(int a, int b)
	{
		int c = a-b;
		System.out.println("subs of a&b: " + c);
	}
	
	public static void main(String[] args) {
		QA2 q2 = new QA2();
		q2.sum(20, 30);  //a*a + b*b
		q2.subs(50, 30);
		q2.printval();
		
		
		
	}

	
	public void QA1IM() {
		System.out.println("this is method of QA1I");
		
	}
	
	
	
}
