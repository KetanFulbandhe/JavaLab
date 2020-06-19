class Myclass3
{
	int num1,num2;
	
	public Myclass3(int n1,int n2)
	{
		num1=n1;
		num2=n2;
		System.out.println("Inside Parameterized Constructor with two argument: "+num1+" "+num2);
	}
	
	public static void main(String args[])
	{
		//creating and passing the values
		Myclass3 m1 = new Myclass3(100,500);
	}
	
}