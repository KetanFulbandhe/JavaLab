class A
{
	private int numA;		//non-static variable
	private static int numA_S=4;	//static variable
	public A(int num)
	{
		System.out.println("Inside Constructor class A");
		this.numA=num;
	}
//setter method 
	public void setNumA(int num)
	{
		System.out.println("Inside Setter method Class A");
		this.numA=num;
	}
//getter method
	public int getNumA()
	{
		System.out.println("Inside Getter method Class A");
		return numA;
	}
//static method class A
	public static int getNumA_S()
	{
		System.out.println("Inside Class A Static method value of static variable");
		return numA_S;
	}
}

class B
{
	private int numB;		//non-static variable
	private static int numB_S=9;	//static variable
	public B(int num)
	{
		System.out.println("Inside Constructor class B");
		this.numB=num;
	}
//setter method 
	public void setNumB(int num)
	{
		System.out.println("Inside Setter method Class B");
		this.numB=num;
	}
//getter method
	public int getNumB()
	{
		System.out.println("Inside Getter method Class B");
		return numB;
	}
//static method class B
	public static int getNumB_S()
	{
		System.out.println("Inside Class B Static method value of static variable");
		return numB_S;
	}
}

class C
{
	private int numC;		//non-static variable
	private static int numC_S=16;	//static variable
	public C(int num)
	{
		System.out.println("Inside Constructor class C");
		this.numC=num;
	}
//setter method 
	public void setNumC(int num)
	{
		System.out.println("Inside Setter method Class C");
		this.numC=num;
	}
//getter method
	public int getNumC()
	{
		System.out.println("Inside Getter method Class C");
		return numC;
	}
//static method class C
	public static int getNumC_S()
	{
		System.out.println("Inside Class C Static method value of static variable");
		return numC_S;
	}
}

public class Demo
{
	private int numD;
	private static int numD_S=25;
	public Demo(int num)
	{
		System.out.println("Inside Demo Constructor");
		this.numD=num;
	}
//setter method Demo
	public void setNumDemo(int num)
	{
		System.out.println("Inside Setter Method Demo");
		this.numD=num;
	}
//getter Class Demo
	public int getNumDemo()
	{
		System.out.println("Inside Getter Method Class Demo");
		return numD;
	}
//Static Method class Demo
	public static int getNumDemo_S()
	{
		System.out.println("Inside Demo class static method value of static variable");
		return numD_S;
	}
	public static void main(String args[])
	{
		//Class A
		A a1 = new A(2);
		System.out.println(a1.getNumA());

		System.out.println(A.getNumA_S());
	System.out.println("***************************************************************");
		//Class B
		B b1 = new B(3);
		System.out.println(b1.getNumB());

		System.out.println(B.getNumB_S());
	System.out.println("***************************************************************");
		//Class C
		C c1 = new C(4);
		System.out.println(c1.getNumC());

		System.out.println(C.getNumC_S());
	System.out.println("***************************************************************");
		//Class Demo
		Demo d1 = new Demo(5);
		System.out.println(d1.getNumDemo());
	
		System.out.println(Demo.getNumDemo_S());
	}
}