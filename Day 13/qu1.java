package Day13Pack;

interface First 
{
	void disp();
	default void mydef()
	{
		System.out.println("Inside Interface mydef");
	}
}

class Sub implements First
{
	@Override
	public void disp() {
		// TODO Auto-generated method stub
		System.out.println("Inside sub disp");
	}
	public void mydef()
	{
		System.out.println("Inside sub mydef");
	}
}

public class qu1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub s =new Sub();
		s.disp();
		s.mydef();
	}

}

