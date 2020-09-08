import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import java.io.*;

public class RegisterServ extends HttpServlet
{
	private Connection con;
	public void init()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/myassg";
			con=DriverManager.getConnection(url,"root","root");
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
	{
		try
		{
			response.setContentType("text/html");
			PrintWriter pw=response.getWriter();
			String nm=request.getParameter("nm");
			String add=request.getParameter("add");
			String email=request.getParameter("email");
			String lid=request.getParameter("lid");
			String pwd=request.getParameter("pwd");					
			PreparedStatement pst=con.prepareStatement("insert into register values(?,?,?,?,?)");
			pst.setString(1,nm);
			pst.setString(2,add);
			pst.setString(3,email);
			pst.setString(4,lid);
			pst.setString(5,pwd);
			
			int k=pst.executeUpdate();
			if(k>0)
			{
				pw.println("Record has been added");
			}
			else
			{
				pw.println("cannot add");
				
			}
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
	}
}




