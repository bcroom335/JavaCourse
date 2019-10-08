package tw.bcroom335.javaproject.practice;


public class P6overloadingcalculator {
	public void plus(int x,int y) {
		System.out.println("x+y="+(x+y));
	}
	public void plus(double a,double b) {
		System.out.println("a+b="+(a+b));
	}
	public static void main(String[] args) {
		P6overloadingcalculator overloading=new P6overloadingcalculator();
		overloading.plus(3.8, 6.94);
		System.out.println("Finished.");
	}

}
