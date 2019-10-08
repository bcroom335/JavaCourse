package tw.bcroom335.javaproject.HW;

public class HW2QuadraticEquationWithOneUnknow {

	public static void main(String[] args) {
		int a=1,b=2,c=3;
		int Judge=b*b-4*a*c;
		double X1=-b+Math.sqrt(Judge);
		double X2=-b-Math.sqrt(Judge);
		if(Judge>=0) {
			System.out.println("X="+X1+"or"+X2);
		}else {
			System.out.println("No Answer");
		}
		System.out.println("Finished");
	}

}
