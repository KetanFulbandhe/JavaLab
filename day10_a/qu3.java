import java.io.*;

public class qu3
{
	public static void main(String args[])
	{
		File fl = new File("E:\\Output_FileAssign\\qu1.txt");
		if(!fl.exists())
		{
			System.out.println("File Not Found");
			System.exit(0);
		}
		try{
			FileInputStream fis = new FileInputStream(fl);
			byte btarr[] = new byte[(int)fl.length()];
			int k = fis.read(btarr);
			String str = new String(btarr);
			System.out.println(str);
			System.out.println("Read Done");
			System.out.println("file copy using byte streams");
			FileOutputStream fos = new FileOutputStream("E:\\Output_FileAssign\\qu3.txt");
			fos.write(btarr);
			System.out.println("Write Done");
		}
		catch (Exception ee)
		{
			ee.printStackTrace();
		}
	}
}