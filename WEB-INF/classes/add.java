import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class add extends HttpServlet
{
	public void doGet(HttpServletRequest re,HttpServletResponse rs) throws IOException, ServletException
	{
		PrintWriter out=rs.getWriter();
		rs.setContentType("text/html");
		int a=Integer.parseInt(re.getParameter("p"));
		int b=Integer.parseInt(re.getParameter("n"));
		int c=Integer.parseInt(re.getParameter("r"));
		int si=(a*b*c)/100;
		
		out.println("\n The simple interest is:"+si);
	}
}
 
		