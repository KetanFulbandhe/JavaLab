

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try
		{
			PrintWriter out =response.getWriter();
			
			ArrayList<String> grp1 = new ArrayList<String>();
			grp1.add("Abhijit");
			grp1.add("Afrin");
			grp1.add("Bharat");
			grp1.add("Divya");
			grp1.add("Kaushal");
			grp1.add("Ketan");
			
			HttpSession session = request.getSession();
			session.setAttribute("Mygrp1", grp1);
			PrintWriter pw=response.getWriter();
			pw.println("Session has been createed...");
			
			/*RequestDispatcher rd = request.getRequestDispatcher("Myjsp");
			rd.forward(request, response);*/
					
		}
		catch(Exception ee)
		{
			System.out.println("in forwarding"+ee);
		}
	}

}
