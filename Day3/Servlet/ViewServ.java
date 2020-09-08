

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ViewServ
 */
@WebServlet("/ViewServ")
public class ViewServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try
		{
			PrintWriter pw=response.getWriter();
			HttpSession session=request.getSession(false);
			pw.println("Inside viewServ you item are:->         ");
			if(session!=null)
			{
				ArrayList<String> purches = (ArrayList<String>) session.getAttribute("prdlst");
				for(String s:purches)
				{
					pw.println(s+",");
				}
			}
			}
			catch(Exception ee)
			{
				ee.printStackTrace();
			}
		
		
	}

}
