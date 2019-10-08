package tw.bcroom335.javaproject.oop.exception;

public class TestCalculateCircleArea {

	public void CircleArea(double r) {
		System.out.println("CircleArea:"+(3.14*r*r));
	}
	
	public static void main(String[] args) {
		if(args.length>=1) {
			try {
			double myr=Double.parseDouble(args[0]);
			TestCalculateCircleArea calcircleArea=new TestCalculateCircleArea();
			calcircleArea.CircleArea(myr);
			}catch(NumberFormatException e) {
				System.out.println("e1"+e);
				System.out.println("Please input correct number.");
			}
		}else {
			System.out.println("Please input number.");
		}

	}

}
