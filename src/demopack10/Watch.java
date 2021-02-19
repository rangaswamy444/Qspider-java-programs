package demopack10;
//assignment question 
//1.watch characteristics are hours,minuate,second
//2.return time as useful information
//3.watches are available in fasttrack showroom
//4.create a watch and display the time
//business logic
public class Watch 
{
	private String bn;
	private	int hr;
	private	int mi;
	private int se;
	public Watch(int hr, int mi, int se) 
	{
		super();
		this.bn="fasttrack";
		this.hr = hr;
		this.mi = mi;
		this.se = se;
	}
	@Override
	public String toString() {
		return "Watch [bn=" +this.bn + ", hr=" +this.hr + ", mi=" +this.mi + ", se=" +this.se + "]";
	}	
}	