import java.io.UnsupportedEncodingException;

public class Main {
	public static void main(String[] args) throws UnsupportedEncodingException {
		
		
		String str = "あいうえお";
		System.out.print("UTF-8	:");
		byte[] utf8 = str.getBytes("UTF-8");
		
	for(byte b :utf8) {
		System.out.printf("%02x",b);
	}
	
	System.out.println("\nUTF-8 :" + new String(utf8,"UTF-32"));
	
		
	}
}