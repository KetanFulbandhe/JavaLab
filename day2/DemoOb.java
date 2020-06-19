public class DemoOb
{
	int num =100;
	public void disp()
	{
		System.out.println("num :"+num);
	}
	public static void main(String args[])
	{
		DemoOb ob1 = new DemoOb(); //first instance
		
		DemoOb ob2=ob1;	
	//ob2 is reference to that instance where ob1 is referring to
		ob1= new DemoOb();
		ob1.disp(); // to test everything run fine
	}
}