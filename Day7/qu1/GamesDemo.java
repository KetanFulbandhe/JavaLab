abstract class Game
{
	public abstract void play();
}
class Football extends Game
{
	public void play()
	{
		System.out.println("Inside Football");
	}
}
class Cricket extends Game
{
	public void play()
	{
		System.out.println("Inside Cricket");
	}
}
class Tennis extends Game
{
	public void play()
	{
		System.out.println("Inside Tennis");
	}
}
public class GamesDemo
{
	
		static void perform(Game arr[])
		{
			if(arr[] instanceof Cricket)
			{
				Cricket obj = (Cricket)arr[i];
				obj.play();
			}	
		}
	public static void main(String args[])
	{
		Game arr[] = new Game[3];
		
		/*arr[0] = new Football();
		perform(arr[0]);
		
		arr[1] = new Cricket();
		perform(arr[1]);
		
		arr[2] = new Tennis();
		perform(arr[2]);*/
		
	}
}