class Course
{
	void start()
	{
	     System.out.println("Inside Start of Course");
	}
	void end()
	{
	     System.out.println("Inside End of Course");
	}
}
class MsCit extends Course
{
	void start()
	{
	     System.out.println("Inside Start of MsCit");
	}
	void end()
	{
	     System.out.println("Inside End of MsCit");
	}
}
class Basic extends Course
{
	void start()
	{
	     System.out.println("Inside Start of Basic");
	}
	void end()
	{
	     System.out.println("Inside End of Basic");
	}
}
class Dbda extends Course
{
	void start()
	{
	     System.out.println("Inside Start of Dbda");
	}
	void end()
	{
	     System.out.println("Inside End of Dbda");
	}
	void Orientation()
	{
	     System.out.println("Inside Orientation of Dbda");
	}
}
public class CourseDemo
{
	static void perform(Course ref)
	{
		if(ref instanceof Dbda)
		{
			Dbda obj = (Dbda)ref;
			obj.Orientation();
		}
		ref.start();
		ref.end();
	}
	public static void main(String args[])
	{
		perform(new MsCit());
		perform(new Basic());
		perform(new Dbda());
	}
}



