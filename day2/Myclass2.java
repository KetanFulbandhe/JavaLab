class Myclass2
{
	int num;
	
	public Myclass2(int n)
	{
		num=n;
		System.out.println("Inside Parameterized Constructor with one argument: "+num);
	}
	
	public static void main(String args[])
	{
		//creating and passing the values
		Myclass2 m1 = new Myclass2(100);
	}
	
}