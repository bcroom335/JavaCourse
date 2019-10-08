package tw.bcroom335.javaproject.practice;

class Encapsulation1{
	private int a=1;
	public  int b=2;
	
	public void action1() {
		System.out.println("Jump");
	}
	private void action2() {
		System.out.println("Walk");
	}
	
}

public class P15Encapsulation1 {
	
	public static void main(String[] args) {
		Encapsulation1 capsulate=new Encapsulation1();
		//System.out.println("capsulate.a:"+capsulate.a);
		System.out.println("capsulate.b:"+capsulate.b);
		capsulate.action1();
		//capsulate.action2();

	}

}
