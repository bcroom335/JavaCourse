package tw.bcroom335.javaproject.oop;

public class CallTestConstuctoeEx1 {
	public CallTestConstuctoeEx1(int value){
		System.out.println("CallTestConstuctoeEx1():"+value);
	}
	public static void main(String[] args) {
		CallTestConstuctoeEx1 test1 = new CallTestConstuctoeEx1(7);
		test1.play();
		
		
		//anonymous object
		new CallTestConstuctoeEx1(6).play();
		
		
		System.out.println("Finished");

	}
	public void play() {
		System.out.println("Let's Play");
	}
}
