

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.*;

import mypack.HibernateUtil;
import mypack.Product;


@WebServlet("/ViewServ")
public class ViewServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try
		{
			Session session=HibernateUtil.getSessionFactory().openSession();
			//Transaction tx=session.beginTransaction();
			Query<?> query=session.createQuery("from Product");
			List<Product> l1=(List<Product>)query.list();
			
			request.setAttribute("records",l1);
			RequestDispatcher rd=request.getRequestDispatcher("View.jsp");
			rd.forward(request, response);
			//PrintWriter pw=response.getWriter();
			//pw.println("l1");
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
		
		}
		
	

}
