package websample11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Java入門 データベース接続クラス.
 */
public class DbConnect {

	public static void main(String[] args) {

		Connection con = null;
		
		try {
			
			// JDBCドライバのロード
			// 「com.mysql.jdbc.Driver」クラス名
			Class.forName("com.mysql.cj.jdbc.Driver");
	
			// データベースと接続
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shimak?serverTimezone=JST", 
											  "root",
											  "letmein31");
			
			// 接続しているデータベース名を表示
			System.out.println(con.getCatalog());
			System.out.println("接続できました");
			
		} catch(ClassNotFoundException ce) {
			
			// JDBCドライバが見つからなかった場合
//			ce.printStackTrace();
			System.out.print("ドライバが見つかりません");
			
		} catch (SQLException se) {
			
			// データベースとの接続に失敗した場合
			se.printStackTrace();
//			System.out.print("接続に失敗しました");
			
		} finally {
			
			try {
				
				// データベースとの接続を解除
				if(con != null) {
					con.close();
				}
				
			} catch (SQLException se) {
				
				// データベースとの接続解除に失敗した場合
				se.printStackTrace();
			}
		}
	}
}