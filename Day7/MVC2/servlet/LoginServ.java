

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.servlet.*;
import mypack.LoginBean;

/**
 * Servlet implementation class LoginServ
 */
@WebServlet("/LoginServ")
public class LoginServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public LoginBean lb=new LoginBean();

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String Login = request.getParameter("Login");
		String Password = request.getParameter("Password");
		 
		boolean result =  lb.validate(Login,Password);
		if(result)
		{
			RequestDispatcher rd = request.getRequestDispatcher("Success.jsp");
			request.setAttribute("log", Login);
			rd.forward(request, response);
			
		}
		else
		{
			RequestDispatcher rd = request.getRequestDispatcher("Fail.jsp");
			request.setAttribute("log", Login);
			rd.forward(request, response);
		}
	}

}
