package 復習;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		String btn = request.getParameter("submit");
		
		HttpSession session = request.getSession();
		RequestDispatcher rd;
		
		if("ログイン".equals(btn)) {
			String id = request.getParameter("id");
			String pass = request.getParameter("pass");
			
			Login login = new Login();
			LoginUserBean loginUserBean = login.getUserData(id, pass);
			
			if(loginUserBean != null) {
				session.setAttribute("user", loginUserBean);
				session.setAttribute("login", login);
				session.setMaxInactiveInterval(180);
				rd = request.getRequestDispatcher("./WEB-sample/loginOK.jsp");
			}else {
				rd = request.getRequestDispatcher("./WEB-sample/loginNG.jsp");
			
			}
			rd.forward(request, response);
			
			
			
			
			
		}
	}

}
