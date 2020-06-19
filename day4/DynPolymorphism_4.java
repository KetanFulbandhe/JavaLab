class Top1
{
	public Top1(){}
	public void disp()
	{
	     System.out.println("Inside Top1 disp()");
	}
}
class Bottom1 extends Top1
{
	public Bottom1(){}
	public void disp()
	{
	     System.out.println("\tInside Bottom1 disp()");
	}
}
class Bottom2 extends Top1
{
	public Bottom2(){}
	public void disp()
	{
	     System.out.println("\tInside Bottom2 disp()");
	}
}
class Bottom3 extends Top1
{
	public Bottom3(){}
	public void disp()
	{
	     System.out.println("\tInside Bottom3 disp()");
	}
}
public class DynPolymorphism_4
{
	public static void main(String args[])
	{
	System.out.println("Dynamic Polymorphism");
	     Top1 bot1 = new Bottom1();
		bot1.disp();
	     Top1 bot2 =new Bottom2();
	     	bot2.disp();
	     Top1 bot3 = new Bottom3();
		bot3.disp();
	}
}