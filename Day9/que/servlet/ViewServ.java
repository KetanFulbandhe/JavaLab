

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.*;

import mypack.HibernateUtil;
import mypack.Register;


public class ViewServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		 Session session=HibernateUtil.getSessionFactory().openSession();  
	    	
		 try {
			
			
		Query<?> query=session.createQuery("from Register");
		List<Register> mylist1=(List<Register>) query.list();
		//System.out.println(mylist1);
		request.setAttribute("records",mylist1);
		RequestDispatcher rd=request.getRequestDispatcher("ViewServ.jsp");
		rd.forward(request, response);
			}
			catch(Exception ee)
			{
				ee.printStackTrace();
			}
	}

}
