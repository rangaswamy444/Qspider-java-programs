package demopack9;
//assignment question
//business logic
public class Car 
{
	private String bn;
	private int ts;
	private double m;
	private String c;
	public Car(String bn, int ts, double m, String c) 
	{
		super();
		this.bn = bn;
		this.ts = ts;
		this.m = m;
		this.c = c;
	}
	public String toString()
	{
		return "top speed:"+this.ts;
	}
	
}
