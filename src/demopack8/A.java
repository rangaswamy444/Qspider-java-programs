package demopack8;
//create 3 interfaces and perform multiple inheritance,create an implementation class
//to implement all the methods present in interface create another class which contains
//method and call all the methods
//business logic
interface A 
{
	public void move();
}
interface B 
{
	public void walk();
}
interface C extends A,B
{
	public void run();
}
class D implements C
{
	public void move()
	{
		System.out.println("move north");
	}
	public void walk()
	{
		System.out.println("walk 5 kms");
	}
	public void run()
	{
		System.out.println("run 3 kms");
	}
	
}
