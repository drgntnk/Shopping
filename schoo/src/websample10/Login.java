package websample10;

/**
 * Java入門 ログイン処理クラス.
 */
public class Login {

	/**
	 * 指定されたIDとパスワードに紐づくユーザ情報を返却します.
	 * @param id	ID
	 * @param pass	パスワード
	 * @return ユーザ情報
	 */
	public LoginUserBean getUserData(String id, String pass) {
		
		// TODO:⑧Beanクラスを新規作成する
		LoginUserBean bean = new LoginUserBean();
		
		// 引数のIDとパスワードを判定
		// TODO:⑨判定処理を追加する（条件はIDとパスワードが一致している場合）
		if("web01".equals(id) && "password".equals(pass)) {
			
			// IDがweb01の場合
			// BeanにIDを設定
			bean.setId(id);
			// TODO:⑪ID設定
			// Beanに名前を設定
			bean.setName("すく太郎");
			// TODO:⑫名前設定
			// Beanに年齢を設定
			// TODO:⑬年齢設定
			bean.setAge(12);
			
		// TODO:⑩判定処理を追加する（条件はIDとパスワードが一致している場合）
		} else if ("web02".equals(id) && "password".equals(pass)) {
			
		
			bean.setId(id);
			// TODO:⑪ID設定
			// Beanに名前を設定
			bean.setName("すく太郎");
			// TODO:⑫名前設定
			// Beanに年齢を設定
			// TODO:⑬年齢設定
			bean.setAge(12);
			
		} else {
			
			// IDが合致しない場合はnullを代入
			bean = null;
		}
		
		return bean;
	}
}