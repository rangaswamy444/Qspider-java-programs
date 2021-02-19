package demopack11;
//compare watches based on seconds
//business logic
public class Watch 
{
	private int hour;
	private int min;
	private int sec;
	public Watch(int hour, int min, int sec) 
	{
		super();
		this.hour = hour;
		this.min = min;
		this.sec = sec;
	}
	@Override
	public String toString() 
	{
		return "Watch [sec=" +this.sec + "]";
	}
	public boolean equals(Object o1)
	{
		Watch rv=(Watch)o1;
		return this.sec ==rv.sec;
	}
	
}
