package qu2Pack;

import java.util.*;

public class qu2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map <Integer,String> studentMap = new HashMap<Integer,String>();
		studentMap.put(1,"Ketan");
		studentMap.put(2,"Mohit");
		studentMap.put(3,"Shrikant");
		studentMap.put(4,"Dipak");
		studentMap.put(5,"Kaushal");
		studentMap.put(6,"Bharat");
		studentMap.put(7,"Abhijit");
		studentMap.put(8,"Akshay");
		studentMap.put(9,"Shriraj");
		studentMap.put(10,"Indrajit");
		
		Iterator stuItr = studentMap.entrySet().iterator();
		while(stuItr.hasNext())
		{
			Map.Entry stu=((Map.Entry)stuItr.next());
			System.out.println("PRN no->"+stu.getKey());
			System.out.println("\tName->"+stu.getValue());
		}
	}

}
