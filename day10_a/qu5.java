import java.io.*;
import java.util.*;

public class qu5
{
	public static void main(String args[])
	{
		int dit;
		int len=0;
		Scanner si = new Scanner(System.in);
		try
		{
			FileOutputStream fos = new FileOutputStream("E:\\Output_FileAssign\\qu5.txt");
			DataOutputStream dos = new DataOutputStream(fos);
			System.out.println("Enter the Number send 0 to stop");
			while((dit=si.nextInt()) != 0)
			{
				dos.writeInt(dit);
				len++;
			}

		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
		try(FileInputStream fis =new FileInputStream("E:\\Output_FileAssign\\qu5.txt"))
		{
			DataInputStream dis = new DataInputStream(fis);
			System.out.println("Reading File");
			for(int i=0;i<len;i++)
			{
				System.out.println(dis.readInt());
			}
		}
		catch(Exception eee)
		{
			eee.printStackTrace();
		}
	}
}