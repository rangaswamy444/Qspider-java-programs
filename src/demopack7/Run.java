package demopack7;
//objectclass(toString)
public class Run 
{
	public static void main(String [] args)
	{
		 Run r1 = new Run();         //(or)   Run r1 = new Run(); 
		 String s1 = r1.toString();  // (or)  System.out.println(r1.toString());
		 System.out.println(s1);     // (or)  System.out.println(r1);
		 Run r2 = new Run();
		 String s2 = r2.toString();
		 System.out.println(s2);
	}
}
