import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Java入門 フォワードクラス.
 */
@WebServlet("/ForwardSample")
public class ForwardSample extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
      
	/**
	 * コンストラクタ.
	 */
    public ForwardSample() {
        super();
    }

    /**
     * GETメソッドでリクエストされた場合の処理.
     */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		// このWebアプリケーションの設定を取得
		ServletContext con = request.getServletContext();
		// このWebアプリケーション内にあるページ（移動先のページ）を決定
		RequestDispatcher rd= con.getRequestDispatcher("/redirect.jsp");
		// 移動先のページに移動
		rd.forward(request, response);
	}
}