package 復習;

public class Login {
	
	public LoginUserBean getUserData(String id,String pass) {
		
		LoginUserBean bean = new LoginUserBean();
		
		
		if("web01".equals(id) && "password".equals(pass)) {
			
			bean.setId(id);
			bean.setName("すく太郎");
			bean.setAge(12);
			
		}else if ("web02".equals(id) && "password".equals(pass)) {
			
		
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
