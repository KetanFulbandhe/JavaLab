package Day13Pack;

interface MyAlgo
{
	static int sqr(int k)
	{
		return k*k;
	}
	static int add(int a,int b)
	{
		return a+b;
	}
	static int product(int a,int b)
	{
		return a*b;
	}

}

public class qu5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("square of 2"+MyAlgo.sqr(2));
		System.out.println("add of 5,7"+MyAlgo.add(5, 7));
		System.out.println("product of 2,5"+MyAlgo.product(2, 5));
	}

}
