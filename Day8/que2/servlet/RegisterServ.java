

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.*;

import mypack.HibernateUtil;
import mypack.Register;
public class RegisterServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{  Session session=HibernateUtil.getSessionFactory().openSession();  
       Transaction transaction=null;
		try {
		 transaction=session.beginTransaction();
		
		String name=request.getParameter("name");
		String address=request.getParameter("address");
		String email=request.getParameter("email").trim();
		String user=request.getParameter("user").trim();
		String password=request.getParameter("password").trim();
		Register r1=new Register();
		r1.setName(name);
		r1.setAddress(address);
		r1.setEmail(email);
		r1.setUser(user);
		r1.setPassword(password);
		
		session.save(r1);
		transaction.commit();
		session.close();
		System.out.println("You are registered successfully...");
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
	}

}
