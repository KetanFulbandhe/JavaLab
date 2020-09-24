package mypack;

import org.hibernate.Session;
import org.hibernate.Transaction;

//right click here and run as java application

public class Main 
{

	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession(); 
        Transaction transaction = null; 
        try { 
            transaction = session.beginTransaction(); 
            Student s1=new Student();
           
           
            s1.setName("Ketankkk");
            s1.setAge(25);
            s1.setAddress("NY city");
            
            Student s2=new Student();
           
        
            s2.setName("tomkk");
            s2.setAge(26);
            s2.setAddress("LA");
            
            session.save(s1);
            session.save(s2);
            transaction.commit(); 
            System.out.println("done with Student");  
             }
        catch(Exception ee)
        {
        	System.out.println("in catch\t"+ee);
        }
}
}








