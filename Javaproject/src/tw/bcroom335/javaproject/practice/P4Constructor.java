package tw.bcroom335.javaproject.practice;

public class P4Constructor {
	public P4Constructor(int value){
		System.out.println("P4Constructor():"+value);
	}
	public static void main(String[] args) {
		P4Constructor test1= new P4Constructor(1);
		test1.play();
		
		new P4Constructor(9).play();
		System.out.println("Finished.");
	}
	public void play() {
		System.out.println("Let's Play.");
	}
}
