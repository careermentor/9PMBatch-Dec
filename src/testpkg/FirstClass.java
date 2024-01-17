package testpkg;



public class FirstClass 
{
	int a=10;
	float d = 10.5f;
	char b = 'X';
    String c = 	"java";
    boolean e = true;

    
    public void printVar()
    {
    	System.out.println(a);  //10
    	
    	System.out.println(d);
    	System.out.println(c);
    	
    }
    
    
    public static void main(String[] args)
    {
    	FirstClass fc = new FirstClass();  //create object of the class
    	fc.printVar();
    	
    //	System.out.println(fc.a);
    	
	}
    
    
	
	
	
	
	
	
}