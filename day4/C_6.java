interface A
{
	public void disp1();
}
interface B extends A
{
	public void disp2();
}
public class C_6 implements B
{
	public void disp1()
	{
		System.out.println("Inside disp1");
	}
	public void disp2()
	{
		System.out.println("Inside disp2");
	}
	public static void main(String args[])
	{
		B obj = new C_6();
		obj.disp1();
		obj.disp2();
	}
}
