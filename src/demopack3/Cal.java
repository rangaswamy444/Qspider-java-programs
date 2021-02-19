//encapsulation program 
package demopack3;

public class Cal 
{
	private int monthNum;
	public Cal(int monthNum)
	{
		if(monthNum >=1 && monthNum<=12)
		{
			this.monthNum=monthNum;
		}
		else
		{
			System.out.println("invalid monthNum");
		}
	}	
		public void givenMonthNum()
		{
			System.out.println("monthNumber:"+this.monthNum);
		}
}
