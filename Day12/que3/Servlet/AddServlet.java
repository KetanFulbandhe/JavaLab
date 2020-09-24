import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mypack.Student;
import mypack.StudentBo;
import mypack.StudentDAODataImpl;
import mypack.StudentDAOFileImpl;
import mypack.StudentDao;


/**
 * Servlet implementation class AddServlet
 */
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw =response.getWriter() ;
		
		String name = request.getParameter("sname");
		String address = request.getParameter("addr");
		String opt = request.getParameter("type1");
		
		Student s1 = new Student();
		s1.setName(name);
		s1.setAddress(address);
		
		if(opt.equalsIgnoreCase("file")) {
			StudentDao sdo = new StudentDAOFileImpl();
			StudentBo sd = new StudentBo(sdo);
			sd.add(s1);
			
			pw.println("Record insert in file...");
		}else {
			StudentDao sdo = new StudentDAODataImpl();
			StudentBo sd = new StudentBo(sdo);
			sd.add(s1);
			pw.println("Record insert in Database...");
		}
		
		
	}

}
