package tw.bcroom335.javaproject.oop;

class MyMathfuction {
	public int f(int x) {
		return 2 * x + 1;
	}
}

public class CallTestMethodEx3 {

	public static void main(String[] args) {
		MyMathfuction fMath = new MyMathfuction();
		int y = fMath.f(7);
		System.out.println("Y=" + y);

	}

}
