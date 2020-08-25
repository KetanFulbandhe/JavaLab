package qu5Pack;

import java.util.HashMap;
import java.util.Map.*;
import java.util.*;

public class qu5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map <Integer,String> icc = new HashMap<Integer,String>();
		icc.put(1,"Sachin Tendulkar");
		icc.put(2,"Verendra Sewag");
		icc.put(3,"Saurav Gangulee");
		icc.put(4,"Kapil Dev");
		icc.put(5, "Mahindra Dhoni");
		
		//Set<Entry<Integer,String>> set = icc.entrySet();
		System.out.println("***Enter the Rank From 1 to 5 press 0 to exit***");
			Scanner sc = new Scanner(System.in);			
			int k=sc.nextInt();
			if(k==0)
			{
				System.out.println("Execution Terminated");
				System.exit(0);
			}
			String val = icc.get(k);
			System.out.println(val);
			k=sc.nextInt();
	}
}
