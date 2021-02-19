package demopack5;
// encapsulation second program
public class Emp 
{
	private int id;
	public Emp(int id)
	{
		if(id>=100 && id<=999)
		{	
			this.id=id;		
		}
		else
		{
		System.out.println("invalid id,it must be 3 digit Num");
		}
	}	
	public void displayEmpId()
	{
		System.out.println("yes Created emp id is"+this.id);
	}
}	
