class Car
{
	public Car()
	{
	     System.out.println("Parent class Car def. Constructor");
	}
}
class Maruti extends Car
{
	public Maruti()
	{
	     System.out.println("sub-1 class Maruti def. Constructor");
	}
}
public class Maruti800_1 extends Maruti
{
	public Maruti800()
	{
	     System.out.println("sub-2 class Maruti800 def. constructor");
	}
	public static void main(String args[])
	{
	     Maruti800 obj = new Maruti800();
	}
}