package qu3Pack;

import static java.lang.System.*;

interface Game
{
	void play();
}
class Cricket implements Game
{
	public void play()
	{
		out.println("Inside play of Cricket");
	}
}
class Football implements Game
{
	public void play()
	{
		out.println("Inside play of Football");
	}
}
class Basketball implements Game
{
	public void play()
	{
		out.println("Inside play of Basketball");
	}
}
class GenCommon<T extends Game>
{
	T obj;
	public GenCommon(T obj)
	{
		this.obj=obj;
	}
	public void Call()
	{
		obj.play();
	}
}
public class qu3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenCommon <Cricket> c1 = new GenCommon<Cricket>(new Cricket());
			c1.Call();
		
		GenCommon <Football> f1 = new GenCommon<Football>(new Football());
			f1.Call();
		GenCommon <Basketball> b1 = new GenCommon<Basketball>(new Basketball());
			b1.Call();
	}

}
