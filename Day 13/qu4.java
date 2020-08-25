package Day13Pack;

interface MyInterface
{
	default void disp()
	{
		System.out.println("Inside Interface disp");
	}
}
class Base
{
	public void disp()
	{
		System.out.println("Inside Base disp");
	}
}
class Sub2 extends Base implements MyInterface
{
	
}
public class qu4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub2 s2 = new Sub2();
		s2.disp(); //Class Wins rule
	}

}
