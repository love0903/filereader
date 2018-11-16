package filereader;

public class main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			c();
		}catch(NullPointerException ex) {
			ex.printStackTrace();
		} 
	}
	static void c() {
		try {
			b();
		}catch(NullPointerException ex) {
			ex.printStackTrace();
			Throwable t = ex.fillInStackTrace();
			throw(NullPointerException)t;
		}
	}
	static void b() {
		a();
	}
	static String a() {
		String text = null;
		return text.toUpperCase();
	}
}
