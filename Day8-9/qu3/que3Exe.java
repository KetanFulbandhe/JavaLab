public class que3Exe implements Runnable
{	
	/*static Class Exe;
	static void show()
	{
		synchronized()
		{
			for(int i=0;i<6;i++)
			{
				System.out.println("Exec "+i);
			}
			System.out.println("+---+");
		}
	}*/
	public void run()
	{
		synchronized()
		{
			for(int i=0;i<6;i++)
			{
				System.out.println("Exec "+i);
			}
			System.out.println("+---+");
		}
	}

	public static void main(String args[])throws Exception
	{
		//Exe = Class.forName("que3Exe");
		que3Exe ot1= new que3Exe();
		/*que3Exe ot2= new que3Exe();
		que3Exe ot3= new que3Exe();*/
		
		Thread t1 = new Thread(ot1);
		Thread t2 = new Thread(ot1);
		Thread t3 = new Thread(ot1);
		
		t1.start();
		t2.start();
		t3.start();
	}
}
