package Day13Pack;

interface Alpha
{
	void perform();
}
class MyClass implements Alpha
{
	static MyClass getAlpha()
	{
		return new MyClass();
	}

	@Override
	public void perform() {
		// TODO Auto-generated method stub
		System.out.println("Inside MyClass perform");
	}
}
public class qu6
{
	public static void main(String args[])
	{
		Alpha a=MyClass.getAlpha();
		a.perform();
	}
}

