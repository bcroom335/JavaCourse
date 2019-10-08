package tw.bcroom335.javaproject.practice;

class UserDefineException extends Exception{
	private static final long serialVersionUID = 1L;
	private String server="Oracle";
	private int port=69;
	private String msg="Normal";
	
	public UserDefineException(String server,int port,String msg) {
		this.server=server;
		this.port=port;
		this.msg=msg;
	}
	
	public void printInfo() {
		System.out.println("Server:"+server+"\nPort:"+port+"\nMassage:"+msg);
	}
	
}

public class P19UserDefineException {

	public static void main(String[] args){
		int code=002;
		if(code%2==0) {
			try{
				throw new UserDefineException("IBM",24,"Virus Attack");
				}catch(UserDefineException e){
					System.out.println("e1"+e);
					e.printInfo();
				}
			}else {
			System.out.println("Server operate Normal.");
		}

	}

}
