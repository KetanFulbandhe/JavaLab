public class ArrayOfObj
{
	public static void main(String args[])
	{
		DemoArr arr[]=new DemoArr[4]; // array of references to DemoArr
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=new DemoArr(); // object creation
			arr[i].disp();	//disp method call
		}		
	}
}

class DemoArr
{
	
	public void disp()
	{
		System.out.println("Inside Disp");
	}
}







