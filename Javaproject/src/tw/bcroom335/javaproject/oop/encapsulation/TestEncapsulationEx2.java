package tw.bcroom335.javaproject.oop.encapsulation;

class bank{
	private int account=10000;
	private String name="Mary";
	
	public int getAccount() {
		return account;
	}
	
	public void setAccount(int account) {
		this.account=account;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}

public class TestEncapsulationEx2 {

	public static void main(String[] args) {
		bank smalltree=new bank();
		smalltree.setAccount(12000);
		int myaccount=smalltree.getAccount();
		System.out.println("myaccount:"+myaccount);

	}

}
