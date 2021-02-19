package demopack12;
//assignment question
//write a program to create two interface and one implementation class,same implementation
//class should implement both the interfaces and override methods of interface
//user logic
interface A 
{
	public void cycle();
}
interface B extends A
{
	public void lorry();
}
class C implements B
{
	public void cycle()
	{
		System.out.println("start riding cycle");
	}
	public void lorry()
	{
		System.out.println("start driving lorry");
	}
}