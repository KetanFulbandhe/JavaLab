public class Emp
{
	private static int cnt=10;
	
	public static int getCnt()
	{
		return cnt;
	}
	public static void setCnt(int c)
	{
		cnt=c;
	}
	public static void main(String args[])
	{
		Emp e1 = new Emp();
		int emp = e1.getCnt();

		System.out.println("cnt: "+emp);
	}
}