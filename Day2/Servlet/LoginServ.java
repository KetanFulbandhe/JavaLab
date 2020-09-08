import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServ extends HttpServlet
{
	private Connection con;
	public void init(ServletConfig config) throws ServletException
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
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			try
			{		       
				String loid=request.getParameter("loid");
				String pass=request.getParameter("lopass");
				PreparedStatement pst=con.prepareStatement("select * from register where login=? and password=?");
			pst.setString(1,loid);
			pst.setString(2,pass);
			ResultSet rs= pst.executeQuery();
			if(rs.next()) {
				try
				{
					RequestDispatcher rd=request.getRequestDispatcher("Success.html");
					rd.forward(request,response);
				}
				catch(Exception ee)
				{
					System.out.println("in forwarding"+ee);
				}
			}else {
				try
				{
					RequestDispatcher rd=request.getRequestDispatcher("fail.html");
					rd.forward(request,response);
				}
				catch(Exception ee)
				{
					System.out.println("in forwarding"+ee);
				}
			}
			}
			catch(Exception ee)
			{
				ee.printStackTrace();
			}		
		}
}