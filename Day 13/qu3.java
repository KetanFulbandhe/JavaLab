package Day13Pack;

interface Second
{
	void disp();
	default void mydef()
	{
		System.out.println("Inside Interface Mydef");
	}
}
class Sub1 implements Second
{

	public void disp() {
		// TODO Auto-generated method stub
		System.out.println("Inside disp of Sub1");
	}
	@Override
	public void mydef()
	{
		System.out.println("Inside overriden mydef of Sub1");
		Second.super.mydef();
	}
	
}
public class qu3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub1 s1 = new Sub1();
		s1.disp();
		s1.mydef();
	}

}
