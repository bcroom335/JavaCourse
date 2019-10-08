package tw.bcroom335.javaproject.flowcontrol;

public class TestNestedIfEx2 {

	public static void main(String[] args) {
		int Number=-14;
		if(0<=Number) {
			System.out.println("Number="+"positive");
		}
			else {
				System.out.println("Number="+"negative");
				}
			if(Number%2==0) {
				System.out.println("Number="+"even");
			}
			else {
				System.out.println("Number="+"odd");
			}
								}

}
