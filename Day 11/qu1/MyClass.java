package qu1Pack;

import java.awt.List;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

class Student implements Serializable
{
	int rollno;
	int age;
	String name;
	/**
	 * @param rollno
	 * @param age
	 * @param name
	 */
	public Student(int rollno, int age, String name) {
		super();
		this.rollno = rollno;
		this.age = age;
		this.name = name;
	}
	
}

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Creating Object...");
		Student s1 = new Student(10, 20, "Ketan");
		Student s2 = new Student(20, 25, "Mohit");
		Student s3 = new Student(30, 30, "Akshay");
		Student s4 = new Student(40, 35, "Kaushal");
		Student s5 = new Student(50, 40, "Tom");
		System.out.println("Object Creation Done");
		System.out.println("Creating ArrayList...");
		ArrayList <Student> stdL = new ArrayList<Student>();
		System.out.println("ArrayList Creation Done");
		System.out.println("Adding Object to ArrayList...");
		stdL.add(s1);
		stdL.add(s2);
		stdL.add(s3);
		stdL.add(s4);
		stdL.add(s5);
		System.out.println("Adding Object Done");
		System.out.println("Iterating through ArrayList");
		Iterator itr = stdL.iterator();
		
		while(itr.hasNext())
		{
			Student st = (Student)itr.next();
			System.out.println(">Rollno : "+st.rollno+" >Age : "+st.age+" >Name : "+st.name);
		}
		System.out.println("Serializing Object in ArrayList...");
		try {
			FileOutputStream fos = new FileOutputStream("F:\\Output\\Day11\\qu1.txt");
			ObjectOutputStream obos = new ObjectOutputStream(fos);
			obos.writeObject(stdL);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("Serialization Done");
		
		System.out.println("Deserializing Object...");
		
		try {
			FileInputStream fins = new FileInputStream("F:\\Output\\Day11\\qu1.txt");
			ObjectInputStream obis =new ObjectInputStream(fins);
			ArrayList mlist = (ArrayList)obis.readObject();
			Iterator itr1 = mlist.iterator();
			
			while(itr1.hasNext())
			{
				Student st = (Student)itr1.next();
				System.out.println(">Rollno : "+st.rollno+" >Age : "+st.age+" >Name : "+st.name);
			}
		} catch (Exception ee) {
			// TODO: handle exception
			ee.printStackTrace();
		}
		System.out.println("Deserialization Done");
	}

}
