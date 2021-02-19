package demopack7;
//objectclass(toString)
public class Run1 
{
	public static void main(String [] args)
	{
		Run rv1 = new Run(); 
		Run rv2 = new Run();
		boolean status = rv1.equals(rv2);
		System.out.println(status);
	}
}
