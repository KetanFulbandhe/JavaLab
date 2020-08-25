package qu1Pack;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Customer implements Serializable {
	int custid = 10;
	String custname ="John";
	String address="NewYork";
	int age=25;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer cust= new Customer();
		System.out.println("Serializaing . . .");
		try {
			FileOutputStream fop = new FileOutputStream("F:\\Output\\qu1.txt");
			ObjectOutputStream obout = new ObjectOutputStream(fop);
			obout.writeObject(cust);
			System.out.println("Serialization Done");
		} catch (Exception ee) {
			// TODO: handle exception
			ee.printStackTrace();
		}
		System.out.println("Deserializaing . . .");
		cust=null;
		
		try {
			FileInputStream fis = new FileInputStream("F:\\Output\\qu1.txt");
			ObjectInputStream obis = new ObjectInputStream(fis);
			Customer cust1=(Customer)obis.readObject();
			System.out.println("custid : "+cust1.custid+"\t"+"custname : "+cust1.custname+"\t"+"address : "+cust1.address+"\t"+"age : "+cust1.age);
			System.out.println("Deserialization Done");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
