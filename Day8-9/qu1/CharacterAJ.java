
public class CharacterAJ extends Thread
{
	public void run()
	{
		for(char i='A';i<='J';i++)
		{
			System.out.println(i);
		}
		
	}
	
	public static void main(String args[])
	{
		CharacterAJ t1 = new CharacterAJ(); 
		CharacterAJ t2 = new CharacterAJ(); 
		
		t1.start();
		t2.start();
		
		t1.setName("first");
		t2.setName("Second");
		System.out.println(t1.getName());
		System.out.println(t1.getName());
	}
}