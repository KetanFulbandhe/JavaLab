

import java.awt.List;
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
 * Servlet implementation class CartServ
 */
@WebServlet("/CartServ")
public class CartServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public CartServ() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out =response.getWriter();
		String item[] = request.getParameterValues("chbk");
		ArrayList<String> prd = new ArrayList<String>();
		for(int i=0;i<item.length;i++)
		{
			prd.add(item[i]);
		}
		HttpSession session = request.getSession();
		session.setAttribute("prdlst", prd);
		RequestDispatcher rd=request.getRequestDispatcher("ViewServ");
		rd.forward(request,response);
	}

}
