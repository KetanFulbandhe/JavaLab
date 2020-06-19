class Vehicle
{
	public Vehicle()
	{
		System.out.println("Def.Constructor Vehicle");
	}
	public void start()
	{
		System.out.println("Inside vehicle Start method");
	}
}
public class FourWheeler_2 extends Vehicle
{
	public FourWheeler_2()
	{
		System.out.println("FourWheeler Def.Constructor");
	}
	public void start()
	{
		System.out.println("Inside FourWheeler Start method ");
	}
	public static void main(String args[])
	{
		System.out.println("Method Overriding");
		FourWheeler_2 f1 =new FourWheeler_2();
		f1.start();
	}
}