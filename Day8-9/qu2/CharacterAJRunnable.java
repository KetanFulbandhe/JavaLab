public class CharacterAJRunnable implements Runnable
{//define a class which implements Runnable
	public void run()
	{//define run()
		for(char c='A';c<='J';c++)
		{
			System.out.println(c);
		}
	}
	
	public static void main(String args[])
	{
		//instantiate the class which impl. Runnable
		CharacterAJRunnable Chobj1 = new CharacterAJRunnable();
		CharacterAJRunnable Chobj2 = new CharacterAJRunnable();
		//instantiate Thread class by passing above instance 			(child of Runnable)
		Thread cht1 = new Thread(Chobj1);
		Thread cht2 = new Thread(Chobj2);
		
		cht1.start();
		cht2.start();
	}
}