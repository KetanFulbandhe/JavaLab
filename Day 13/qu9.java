package Day13Pack;
interface MyInterface9
{
	void fun(char a,int b);
}

class SomeClass
{
	void disp(char a,int b)
	{
		System.out.println("In disp: "+a+" "+b);
	}
}

public class qu9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SomeClass so1 = new SomeClass();
		System.out.println("using lambda");
		MyInterface9 m1 = (a,b)->{
			System.out.println("In fun: "+a+" "+b);
			so1.disp(a,b);
		};
		m1.fun('A', 10);
		
		System.out.println("using method reference");
		MyInterface9 m2 = so1::disp;
		m2.fun('p', 11);
	}

}
