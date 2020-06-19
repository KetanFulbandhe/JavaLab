class Parent1
{
	public Parent1()
	{
		System.out.println("Inside Parent1 class");
	}
}
interface Parent2
{
	public void disp();
}

class Child extends Parent1 implements Parent2
{
	public void disp()
	{
		System.out.println("Inside Child Class inteface method");
	}
}

public class Seven_7
{
	public static void main(String args[])
	{
		Child c1 = new Child();
		c1.disp();
	}
}