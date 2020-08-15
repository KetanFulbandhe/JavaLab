import java.io.*;
import java.util.Scanner;
public class qu1
{
	public static void main(String args[])
	{
		char arr1[]=null;
		try(FileWriter fw=new FileWriter("E:\\Output_FileAssign\\qu1.txt"))
		{
		char chr[]=new char[10];
        Scanner cs=new Scanner(System.in);
        System.out.println("enter the string");
        for(int i=0;i<10;i++)
        {
            char c=cs.next().charAt(0);
            chr[i]= c;
        }
		fw.write(chr);
		}
		catch(IOException ie)
		{
			ie.printStackTrace();
		}
		try(FileReader fr=new FileReader("E:\\Output_FileAssign\\qu1.txt"))
		{

		arr1=new char[(int)new File("E:\\Output_FileAssign\\qu1.txt").length()];
		fr.read(arr1);
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
		
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println("-->"+arr1[i]);
		}
	}
}





























			