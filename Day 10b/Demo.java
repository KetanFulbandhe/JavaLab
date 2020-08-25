package qu2Pack;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable
{
	private String name;
	private int age;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @param name
	 * @param age
	 */
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}	
}

class Student extends Person
{
	private int rollno;

	/**
	 * @return the rollno
	 */
	public int getRollno() {
		return rollno;
	}

	/**
	 * @param rollno the rollno to set
	 */
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	/**
	 * @param name
	 * @param age
	 * @param rollno
	 */
	public Student(String name, int age, int rollno) {
		super(name, age);
		this.rollno = rollno;
	}	
	
	
}

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(">>>Creating Object<<<");
		Student s1 = new Student("John",25,10);
		System.out.println("***Object Creation Done***");
		System.out.println("Name : "+s1.getName());
		System.out.println("Age : "+s1.getAge());
		System.out.println("Roll No : "+s1.getRollno());
		System.out.println(">>>Serializaing Object<<<");
		try {
			FileOutputStream fos = new FileOutputStream("F:\\Output\\qu2.txt");
			ObjectOutputStream ops =new ObjectOutputStream(fos);
			ops.writeObject(s1);
			System.out.println("***Serialization Done***");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println(">>>Deserializing Object<<<");
		s1=null;
		try {
			
			FileInputStream fin = new FileInputStream("F:\\Output\\qu2.txt");
			ObjectInputStream ois = new ObjectInputStream(fin);
			Student s2 = (Student)ois.readObject();
			System.out.println("Name : "+s2.getName());
			System.out.println("Age : "+s2.getAge());
			System.out.println("Roll No : "+s2.getRollno());
			System.out.println("***Deserialization Done***");
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
	}

}
