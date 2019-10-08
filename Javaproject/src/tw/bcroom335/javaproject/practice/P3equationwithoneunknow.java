package tw.bcroom335.javaproject.practice;

class myMathfuction{
	public int f(int x) {
		return 2 * x + 1;
	}
}

public class P3equationwithoneunknow {

	public static void main(String[] args) {
		myMathfuction fMath=new myMathfuction();
		int Y=fMath.f(7);
		
		System.out.println("Y="+Y);
	}

}
