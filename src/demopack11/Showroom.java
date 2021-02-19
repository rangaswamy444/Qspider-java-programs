package demopack11;
//compare watches based on seconds
//user logic
public class Showroom 
{
	public static void main(String[] args)
	{
		Watch w1 = new Watch(2,12,26);
		Watch w2 = new Watch(5,3,26);
		System.out.println(w1);
		System.out.println(w2);
		boolean status = w1.equals(w2);
		System.out.println(status);
	}
}
