
class Runnable1 implements Runnable
{
	public void run()
	{
		for(int i=1;i<50;i++)
		{
			System.out.println(i);
			try
			{
				Thread.sleep(100);
			}
			catch(InterruptedException ie)
			{
				
			}
		}
	}
}
class Runnable2 implements Runnable
{
	public void run()
	{
		for(int i=50;i>=1;i--)
		{
			System.out.println(i);
			try
			{
				Thread.sleep(100);
			}
			catch(InterruptedException ie)
			{
				
			}
		}
	}
}
public class OneToFifty
{
	public static void main(String args[])throws Exception
	{
		/*Runnable1 of1 = new Runnable1();
		Runnable2 of2 = new Runnable2();
		
		Thread oft1 = new Thread(of1);
		Thread oft2 = new Thread(of2);*/
		
		Thread oft1 = new Thread(new Runnable1());
		Thread oft2 = new Thread(new Runnable2());
		
		oft1.start();
		oft2.start();
	}
}