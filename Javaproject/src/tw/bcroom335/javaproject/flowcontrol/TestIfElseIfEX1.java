package tw.bcroom335.javaproject.flowcontrol;

public class TestIfElseIfEX1 {

	public static void main(String[] args) {
		int month =2, Year = 1996;

		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			System.out.println("Month:" + month + "have 31 days");
		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
			System.out.println("Month:" + month + "have 30 days");
		} else if (month == 2) {
			if ((Year % 4 == 0 && Year % 100 != 0) || Year % 400==0) {
						System.out.println("Month:" + month +"  "+ "have 29days");
					}else {
						System.out.println("Month:" + month +"  "+ "have 28days");
					}
				}else {
					System.out.println("Month:" + month + "is invalid month.");

		}
		System.out.println("Keep Writing Java~~");
	}

}
