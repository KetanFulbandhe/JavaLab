

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.*;
import org.hibernate.query.Query;

import mypack.HibernateUtil;


@WebServlet("/DataServlet")
public class DataServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String loc = request.getParameter("loc");
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			
			Query<?> query=session.createQuery("from Dept d where d.loc =:i");
			query.setParameter("i",loc);
			List<Object[]> mylist=(List<Object[]>) query.list();
			request.setAttribute("records", mylist);
			RequestDispatcher rd = request.getRequestDispatcher("Data.jsp");
			rd.forward(request, response);
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
