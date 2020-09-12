

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mypack.CareerExpert;

/**
 * Servlet implementation class CareerServ
 */
@WebServlet("/CareerServ")
public class CareerServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String qualify = request.getParameter("qual");
		CareerExpert c1 = new CareerExpert();
		String advice = c1.getAdvice(qualify);
		request.setAttribute("adv", advice);
		RequestDispatcher rd=request.getRequestDispatcher("CareerDetails.jsp");
		rd.forward(request,response);
	}

}
