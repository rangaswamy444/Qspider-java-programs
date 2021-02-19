package demopack6;
// abstraction second program
interface A 
{
	public void move();
}
class B implements A
{
	public void move()
	{
		System.out.println("move north");
	}
}
class HelperClass
{
	public static A helperMethod()
	{
						//(or) A a1 = new B();
	return new B();    //(or) return a1;
	}
}
