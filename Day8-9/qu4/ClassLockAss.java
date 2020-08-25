public class ClassLockAss implements Runnable
{
	static Class cls;
	static void show()
	{
		synchronized(cls)
		{
			for(int i=0;i<=10;i++)
			{
				System.out.println(i);
			}
		}
	}

	public void run()
	{
		show();
		System.out.println("+-----+");
	}
	public static void main(String args[])throws Exception
	{
		cls = Class.forName("ClassLockAss");
		ClassLockAss clk1 = new ClassLockAss();
		ClassLockAss clk2 = new ClassLockAss();
		Thread clkt1 = new Thread(clk1);
		Thread clkt2 = new Thread(clk2);
		clkt1.start();
		clkt2.start();
	}
}
