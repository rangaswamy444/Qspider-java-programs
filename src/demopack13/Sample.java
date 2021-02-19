package demopack13;
//checked exception propagation
public class Sample 
{
	public static void display() throws InterruptedException 
	{
		Thread.sleep(5000);
		System.out.println("hello");
	}	
	public static void main(String [] args)
	{
		System.out.println("main starts....");
		try
		{
			display();
		}
		catch(InterruptedException rv)
		{
			System.out.println("Exception is caught...");
		}	
		System.out.println("main ends....");
	 }
	
}
