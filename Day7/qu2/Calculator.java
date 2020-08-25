public class Calculator
{
	public int sqr(int num)throws MyArithException
	{
		if(num<0)
		{
			throw new MyArithException("negative not allowed");
		}
		else if(num == 0)
		{
			throw new MyArithException("Zero not allowed");
		}
		return num*num;
	}

	static void disp()throws MyArithException
	{
		Calculator c=new Calculator();
		int result=0;
		result=c.sqr(2);
		System.out.println(result);
	}
	public static void main(String args[])throws MyArithException
	{
		disp();
	}
}
		