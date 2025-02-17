package vn.nganha;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class ServletHello
 */
@WebServlet("/ServletHello")
public class ServletHello extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ServletHello() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		PrintWriter print = response.getWriter();
		print.append("Hello! Can I have your name?");
		String inputName = "<form method = POST action=\"/ServletTest/ServletHello\">"
				+ "<lable> My name is: </lable>"
				+ "<input type = \"text\" name =\"mName\">"
				+ "<input type = \"submit\" value =\"Send\">"
				+ "</form>";
		print.append(inputName);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		String valueName = request.getParameter("mName");
		PrintWriter print = response.getWriter();
		print.append("<h1>Hello " + valueName + "</h1>");
	}

}
