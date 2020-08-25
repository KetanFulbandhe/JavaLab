import java.util.*;
public class MyCalcApp
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
		System.out.println("Enter number: ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		MyCalcApp c=new MyCalcApp();
		int result=0;
		result=c.sqr(num);
		System.out.println(result);
	}
	public static void main(String args[])throws MyArithException
	{
		disp();
	}
}
		