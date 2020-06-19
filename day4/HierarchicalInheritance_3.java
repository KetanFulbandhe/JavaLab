class A
{
	public A()
	{
	     System.out.println("Inside class A def.Constructor");
	}
}
class B extends A
{
	public B()
	{
	     System.out.println("\tInside class B def.Constructor");
	}
}
class C extends A
{
	public C()
	{
	     System.out.println("\tInside class C def.Constructor");
	}
}
class D extends A
{
	public D()
	{
	     System.out.println("\tInside Class D def.Constructor");
	}
}
class HierarchicalInheritance_3
{
	public HierarchicalInheritance_3()
	{
	      System.out.println("Inside invocation class");
	}
	public static void main(String args[])
	{
	     B objB = new B();
	     C objC = new C();
	     D objD = new D();
	}
}