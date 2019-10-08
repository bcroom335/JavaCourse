package tw.bcroom335.javaproject.practice;

class calculator {
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

public class P2calculator {

	public static void main(String[] args) {
		calculator casio = new calculator();
		casio.plus(3, 9);
		casio.minus(19, 2);
		casio.table(9, 18);
		casio.divide(20, 4);
		System.out.println("Finished.");
	}

}
