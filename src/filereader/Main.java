package filereader;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Resource res = new Resource()){
			res.doSome();
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}

class Resource implements AutoCloseable{
	void doSome() {
		System.out.println("���@�Ǩ�");
	}
	@Override
	public void close() throws Exception{
		System.out.println("�귽�Q����");
	}
}
