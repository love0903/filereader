package filereader;

public class Main2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Resourcesome some  = new Resourcesome();Resourceother other  = new Resourceother()){
			some.doSome();
			other.doSome();
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}

class Resourcesome implements AutoCloseable{
	void doSome() {
		System.out.println("做一些事");
	}
	@Override
	public void close() throws Exception{
		System.out.println("資源some被關閉");
	}
}
class Resourceother implements AutoCloseable{
	void doSome() {
		System.out.println("做一些事");
	}
	@Override
	public void close() throws Exception{
		System.out.println("資源other被關閉");
	}
}