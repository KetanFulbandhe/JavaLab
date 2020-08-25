package qu4Pack;

import java.awt.List;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

public class Employee implements Serializable {
	
	private int empid;
	private String empname;
	private String desig;
	private int basic;

	/**
	 * @param empid
	 * @param empname
	 * @param desig
	 * @param basic
	 */
	public Employee(int empid, String empname, String desig, int basic) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.desig = desig;
		this.basic = basic;
	}
	
	public void disp()
	{
		System.out.println("empid :"+empid);
		System.out.println("empname :"+empname);
		System.out.println("desig :"+desig);
		System.out.println("basic :"+basic);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee(10,"Ketan", "DEV",3000);
		e1.disp();
		Employee e2 = new Employee(11,"Todd", "B.A.",2000);
		e2.disp();
		Employee e3 = new Employee(12,"Tom", "TESTER",2500);
		e3.disp();
		Employee e4 = new Employee(13,"John", "HR",2000);
		e4.disp();
		ArrayList<Employee> emp = new ArrayList<Employee>();
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		emp.add(e4);
		System.out.println("\t****Serialization****");
		try {
			FileOutputStream fileout = new FileOutputStream("F:\\Output\\Day11\\qu4.txt");
			ObjectOutputStream out = new ObjectOutputStream(fileout);
			out.writeObject(emp);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("\t****Deserialization****");
		e1=null;e2=null;e3=null;e4=null;
		try {
			FileInputStream fileIn = new FileInputStream("F:\\Output\\Day11\\qu4.txt");
			ObjectInputStream oin =new ObjectInputStream(fileIn);
			//List<Employee> emp1 =new (List<Employee>)oin.readObject();
			ArrayList empout = (ArrayList)oin.readObject();
			Iterator itr1 = empout.iterator();
			
			while(itr1.hasNext())
			{
				Employee ep = (Employee)itr1.next();
				System.out.println(ep.empid+" "+ep.empname+" "+ep.desig+" "+ep.basic);
			}
		} catch (Exception ee) {
			// TODO: handle exception
			ee.printStackTrace();
		}
	}

}