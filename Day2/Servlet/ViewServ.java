import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
public class ViewServ extends HttpServlet
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
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{
		PrintWriter out = response.getWriter();  
	        response.setContentType("text/html");
		out.println("<html><body>");
		try
		{
			Statement stmt = con.createStatement();
			ResultSet rs =stmt.executeQuery("Select * from register");
			out.println("<table>"); 
			out.println("<tr><th>name</th><th>address</th><th>email</th><th>login</th><th>password</th><tr>");
			while(rs.next())
			{
				String s1 =rs.getString("name");
				String s2 =rs.getString("address");
				String s3 =rs.getString("email");
				String s4 =rs.getString("login");
				String s5 =rs.getString("password");
				out.println("<tr><td>"+s1+"</td><td>"+s2+"</td><td>"+s3+"</td><td>"+s4+"</td><td>"+s5+"</td></tr>");
			}
			out.println("</table>");
			out.println("</html></body>");
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
	}
}