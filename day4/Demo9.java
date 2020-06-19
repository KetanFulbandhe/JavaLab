interface Game
{
	abstract void play();
}
class Cricket implements Game
{
	public void play()
	{
	     System.out.println("Inside Cricket class play()");
	}
	public void AbtGame()
	{
	     System.out.println("\tInside Cricket About");
	}
}
class Football implements Game
{
	public void play()
	{
	     System.out.println("Inside Football play()");
	}
}
class Tennis implements Game
{
	public void play()
	{
	     System.out.println("Inside Tennis play()");
	}
}
public class Demo9
{
	static void perform(Game ref)
	{
	     if(ref instanceof Cricket)
		{
			Cricket obj = (Cricket)ref;
		        obj.AbtGame();
		}
	     ref.play();
	}

	public static void main(String args[])
	{
	     perform(new Cricket());
	     perform(new Football());
	     perform(new Tennis());
	}
}