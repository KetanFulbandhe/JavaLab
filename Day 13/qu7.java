package Day13Pack;

interface Base1
{
	int product(int a,int b);
}

public class qu7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base1 ref=(a,b)->{return a*b;};
		System.out.println(ref.product(2,5));
	}

}
