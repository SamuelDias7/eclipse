package times;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class times
 */
public class times extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public times() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		out.println("<!doctype html>");
		out.println("<html>");
		out.println("<title> Brasileirao</title>");
		out.println("<body>");
		out.println("<h1> Classificacao do Brasileirao:</h1>");
		out.println("flamengo");
		out.println("<br/>");
		out.println("Corinthians");
		out.println("<br/>");
		out.println("Palmeiras");
		out.println("<br/>");
		out.println("</body>");
		out.println("</html>");
	}

}
