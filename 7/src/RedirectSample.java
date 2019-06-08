import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Java入門 リダイレクトクラス.
 */
@WebServlet("/RedirectSample")
public class RedirectSample extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
      
	/**
	 * コンストラクタ.
	 */
    public RedirectSample() {
        super();
    }

    /**
     * GETメソッドでリクエストされた場合の処理.
     */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		// 指定したパスにリダイレクトさせる
		response.sendRedirect("https://www.google.com/search?client=firefox-b-d&q=%EF%BD%8B");
	}
}