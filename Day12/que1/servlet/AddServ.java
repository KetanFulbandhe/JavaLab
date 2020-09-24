

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import mypack.HibernateUtil;
import mypack.Product;


@WebServlet("/AddServ")
public class AddServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String pname=request.getParameter("pname");
		int price=Integer.parseInt(request.getParameter("price"));
		
		int quantity=Integer.parseInt(request.getParameter("quantity"));
		try
		{
			Session session=HibernateUtil.getSessionFactory().openSession();
			Transaction tx=session.beginTransaction();
			Product p1=new Product();
			p1.setPname(pname);
			p1.setPrice(price);
			p1.setQuantity(quantity);
			session.save(p1);
			tx.commit();
			RequestDispatcher rd=request.getRequestDispatcher("Add.jsp");
			rd.forward(request,response);
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
		
	}

}
