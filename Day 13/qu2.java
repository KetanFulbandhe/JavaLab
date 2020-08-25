package Day13Pack;

interface A
{
	default void fun()
	{
		System.out.println("Inside fun of A");
	}
}
interface B
{
	default void fun()
	{
		System.out.println("Inside fun of B");
	}
}
class C implements A,B
{
	public void fun()
	{
		System.out.println("Inside fun of C");
	}
}
public class qu2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c1 = new C();
		c1.fun();
	}

}
