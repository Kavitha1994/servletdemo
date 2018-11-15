

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String username=request.getParameter("username");
		String passwd=request.getParameter("passwd");
		String gender=request.getParameter("gender");
		String mobileno=request.getParameter("mobileno");
		String city=request.getParameter("city");
		out.println("<font color=red>Please fill all the fields</font>");

		out.println("<table align='center'>");
		out.println("<tr><td>User Name<td><td>:"+username+"</td></tr>");
		out.println("<tr><td>Password<td><td>:"+passwd+"</td></tr>");
		out.println("<tr><td>Gender<td><td>:"+gender+"</td></tr>");
		out.println("<tr><td>Mobile Number<td><td>:"+mobileno+"</td></tr>");
		out.println("<tr><td>City<td><td>:"+city+"</td></tr>");

	}

}
