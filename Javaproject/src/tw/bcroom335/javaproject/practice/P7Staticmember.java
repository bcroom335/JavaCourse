package tw.bcroom335.javaproject.practice;

class motorcycle{
	public void speed() {
		System.out.println("Speed up.");
	}
	public static void brake() {
		System.out.println("Stop.");
	}
}

public class P7Staticmember {

	public static void main(String[] args) {
		motorcycle sym=new motorcycle();
		sym.speed();
		motorcycle.brake();
		
	}

}
