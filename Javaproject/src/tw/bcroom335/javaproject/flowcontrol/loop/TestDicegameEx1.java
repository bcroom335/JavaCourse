package tw.bcroom335.javaproject.flowcontrol.loop;

public class TestDicegameEx1 {

	public static void main(String[] args) {
		int yournumber = 1;
		while (true) {
		int dicenumber = (int) (Math.random() * 6 + 1);
		System.out.println("dicenumber=" + dicenumber);
			if (yournumber == dicenumber) {
				System.out.println("You Win !!");
				break;
			} else {
				System.out.println("Try Again !!");
			}
		}
		System.out.println("Keep Writing JAVA~~~");

	}

}
