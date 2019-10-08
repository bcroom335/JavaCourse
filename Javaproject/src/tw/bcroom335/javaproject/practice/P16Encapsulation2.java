package tw.bcroom335.javaproject.practice;

class bank{
	private int account=20000;
	private String name="Mary";
	
	public int getAccount(){
		return account;
	}
	public void setAccount(int account) {
		this.account=account;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
}

public class P16Encapsulation2 {

	public static void main(String[] args) {
		bank home=new bank();
		home.setAccount(50000);
		home.setName("Jake");
		System.out.println("home.Account:"+home.getAccount());
		System.out.println("home.name:"+home.getName());

	}

}
