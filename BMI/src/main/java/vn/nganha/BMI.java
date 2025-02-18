package vn.nganha;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class BMI
 */
@WebServlet("/BMI")
public class BMI extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public BMI() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        out.println("<html>");
        out.println("<head><title>Tính BMI</title>");
        out.println("<style>");
        out.println("body { font-family: Arial, sans-serif; text-align: center; background-color: #f4f4f4; }");
        out.println(".container { width: 40%; margin: auto; padding: 20px; background: white; border-radius: 10px; box-shadow: 0px 0px 10px rgba(0,0,0,0.1); }");
        out.println("h1 { color: #007bff; }");
        out.println("input, button { padding: 10px; width: 80%; margin: 10px 0; }");
        out.println("button { background-color: #007bff; color: white; border: none; cursor: pointer; }");
        out.println("button:hover { background-color: #0056b3; }");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");
        out.println("<div class='container'>");
        out.println("<h1>Kiểm tra chỉ số BMI</h1>");
        out.println("<form action='BMI' method='post'>");
        out.println("<label for='height'>Chiều cao (m):</label><br>");
        out.println("<input type='text' name='height' required><br>");
        out.println("<label for='weight'>Cân nặng (kg):</label><br>");
        out.println("<input type='text' name='weight' required><br>");
        out.println("<button type='submit'>Tính BMI</button>");
        out.println("</form>");
        out.println("</div>");
        out.println("</body>");
        out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        try {
            double height = Double.parseDouble(request.getParameter("height"));
            double weight = Double.parseDouble(request.getParameter("weight"));
            double bmi = weight / (height * height);

            String result = "";
            if (bmi < 18.5) {
                result = "Ốm";
            } else if (bmi < 24.9) {
                result = "Bình thường";
            } else if (bmi < 29.9) {
                result = "Thừa cân";
            } else {
                result = "Béo phì";
            }

            out.println("<html>");
            out.println("<head><title>Kết quả BMI</title>");
            out.println("<style>");
            out.println("body { font-family: Arial, sans-serif; text-align: center; background-color: #f4f4f4; }");
            out.println(".container { width: 40%; margin: auto; padding: 20px; background: white; border-radius: 10px; box-shadow: 0px 0px 10px rgba(0,0,0,0.1); }");
            out.println("h1 { color: #007bff; }");
            out.println("p { font-size: 18px; color: #555; }");
            out.println(".result { font-size: 20px; font-weight: bold; color: #ff5733; }");
            out.println("</style>");
            out.println("</head>");
            out.println("<body>");
            out.println("<div class='container'>");
            out.println("<h1>Kết quả chỉ số BMI</h1>");
            out.println("<p>Chiều cao: " + height + " m</p>");
            out.println("<p>Cân nặng: " + weight + " kg</p>");
            out.println("<p>BMI của bạn: <span class='result'>" + String.format("%.2f", bmi) + "</span></p>");
            out.println("<p>Kết luận: <span class='result'>" + result + "</span></p>");
            out.println("<a href='BMI'><button>Quay lại</button></a>");
            out.println("</div>");
            out.println("</body>");
            out.println("</html>");
        } catch (NumberFormatException e) {
            out.println("<html><body><h3 style='color:red;'>Vui lòng nhập đúng định dạng số!</h3><a href='BMI'>Quay lại</a></body></html>");
        }
	}

}
