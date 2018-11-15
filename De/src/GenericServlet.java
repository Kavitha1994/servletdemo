import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.PrintWriter;
@WebServlet("/GenericServlet")
public class GenericServlet extends javax.servlet.GenericServlet {
	private static final long serialVersionUID = 1L;
        public GenericServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		out.println("<html>");
		out.println("<body>");
		out.println("This is a simple Generic Servlet I have created.");
		out.println("</body>");
		out.println("</html>");
	}

}
