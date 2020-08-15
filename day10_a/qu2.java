import java.lang.reflect.*;
//import java.lang.reflect.Constructor;
//import java.lang.refelct.Field;

import java.io.*;

public class qu2
{
	public static void main(String args[])
	{
		try(RandomAccessFile rf = new RandomAccessFile("E:\\Output_FileAssign\\qu2.txt","rw"))
	{
		rf.seek(rf.length());
		System.out.println("Enter first message");
		byte b[]=new byte[200];
		int k = System.in.read(b);
		rf.write(b,0,k);
		rf.seek(0);
		byte c[]=new byte[(int)rf.length()];
		rf.read(c);
		String ss = new String(c);
		System.out.println("Enter second Message");
		k=System.in.read(b);
		rf.write(b,0,k);
		System.out.println("Reading Complete Contain of the file");
		rf.seek(0);
		c=new byte[(int)rf.length()];
		rf.read(c);
		ss=new String(c);
		System.out.println(ss);
	}
	catch(Exception ee)
	{
		ee.printStackTrace();
	}
	}
}