package tw.bcroom335.javaproject.flowcontrol.loop;

public class TestDicegameEx2 {

	public static void main(String[] args) {
		int count = 0;
		int yournumber = 1;
		int yourchance = 3;
		while (true) {
			int dicenumber = (int) (Math.random() * 6 + 1);
			System.out.println("dicenumber=" + dicenumber);
			if (yournumber == dicenumber) {
				count++;
				if (count == yourchance) {
					System.out.println("You Win !!");
					break;
				}
			} else {
				System.out.println("Try Again !!");
			}

		}
		System.out.println("Keep Writing JAVA~~~");
	}

}
