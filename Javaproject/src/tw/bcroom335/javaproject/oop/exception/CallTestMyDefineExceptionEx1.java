package tw.bcroom335.javaproject.oop.exception;

class TestMyDefineException extends Exception{
	private static final long serialVersionUID = 1L;
	private String server="Apple Pro";
	private int port=45;
	private String msg="Normal";
		
	public TestMyDefineException(String server,int port,String msg) {
		this.server=server;
		this.port=port;
		this.msg=msg;
	}
	public void showInfo() {
	System.out.println("server:"+server);
	System.out.println("port:"+port);
	System.out.println("message:"+msg);
	}
}

public class CallTestMyDefineExceptionEx1 {

	public static void main(String[] args) {
		int code=006;
		if(code%2==0) {
			try {
			throw new TestMyDefineException("Google",80,"Virus attack.");
			}catch(TestMyDefineException e){
				System.out.println("e1"+e);
				e.showInfo();
			}
		}else {
			System.out.println("System operate normal.");
		}

	}

}
