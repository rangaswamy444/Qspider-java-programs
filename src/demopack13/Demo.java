package demopack13;
//uncheked exception propagation
public class Demo 
{
	public static void main(String [] args)
	{
		System.out.println("main starts...");
	try
	{
		division();
	}
	catch(ArithmeticException rv)
	{
		System.out.println("exception is caught");
	}
		System.out.println("main ends.....");
	}

	public static void division()
	{
		System.out.println("division starts.....");
		int a=10;
		int b=0;
		System.out.println(a/b);
		System.out.println("division ends..");
	}	
}	

