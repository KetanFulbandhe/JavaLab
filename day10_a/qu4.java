import java.io.*;
public class qu4
{
	public static void main(String args[])
	{
		File fl4 = new File("E:\\Output_FileAssign\\qu1.txt");
		if(!fl4.exists())
		{
			System.out.println("File Not Found");
			System.exit(0);
		}
		try{
			FileReader frd = new FileReader(fl4);
			char charr[] = new char[(int)fl4.length()];
			int k = frd.read(charr);
			String chstr = new String(charr);
			System.out.println("Read Done");
			System.out.println("File copy using unicode character streams");
			FileWriter fwt = new FileWriter("E:\\Output_FileAssign\\qu4.txt");
			fwt.write(charr);
			String ss = new String(charr);
			//System.out.println(charr);
			System.out.println("Write Done");
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
	}
}