class Base1
{
	int num;
	public Base1(int k)
	{
	     System.out.println("Inside Base1 para.Constructor "+k);
	     this.num=k;
	}
}
class Sub1 extends Base1
{
	public Sub1()
	{
	     super(30);
	     System.out.println("\tSub1 Def.Constructor ");
	}
	public Sub1(int n1)
	{
	     super(40);
	     System.out.println("\tSub1 one-param.Constructor "+n1);
	}
	public Sub1(int n2, int n3)
	{
	     super(50);
	     System.out.println("\tSub1 two-param.Constructor "+n2+" "+n3);
	}
}
public class Eight_8
{
	public static void main(String args[])
	{
		Sub1 s1 = new Sub1();
		Sub1 s2 = new Sub1(100);
		Sub1 s = new Sub1(10,20);
		
	}
}