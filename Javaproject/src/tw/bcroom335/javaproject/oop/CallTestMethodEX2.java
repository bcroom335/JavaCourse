package tw.bcroom335.javaproject.oop;

class Calculator {
	public void plus(int x1, int y1) {
		System.out.println("x1+y1=" + (x1 + y1));
	}

	public void minus(int x2, int y2) {
		System.out.println("x2-y2=" + (x2 - y2));
	}

	public void table(int x3, int y3) {
		System.out.println("x3*y3=" + (x3 * y3));
	}

	public void divide(int x4, int y4) {
		System.out.println("x4/y4=" + (x4 / y4));
	}
}

public class CallTestMethodEX2 {

	public static void main(String[] args) {
		Calculator casio = new Calculator();
		casio.plus(3, 4);
		casio.minus(6, 3);
		casio.table(9, 9);
		casio.divide(10, 3);
		System.out.println("Finished.");

	}

}
