package tw.bcroom335.javaproject.oop;

class motocycle {
	public void speedUp() {
		System.out.println("Speed up.");
	}

	public static void brake() {
		System.out.println("Stop.");
	}
}

public class CallStaticmemberEx1 {

	public static void main(String[] args) {
		motocycle gogoro = new motocycle();
		gogoro.speedUp();

		motocycle.brake();

	}

}
