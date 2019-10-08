package tw.bcroom335.javaproject.HW;

public class HW4ScissoersPaperStoneGame {

	public static void main(String[] args) {
		int gamer1 = (int) (Math.random() * 3 + 1);
		int gamer2 = (int) (Math.random() * 3 + 1);
		System.out.println("1 is Scissors  2 is Stone  3 is Paper");
		if ((gamer1 == 1 && gamer2 == 3) || (gamer1 == 2 && gamer2 == 1) || (gamer1 == 3 && gamer2 == 2)) {
			System.out.println("Gamer1's choice:" + gamer1 + "\nGamer2's choice:" + gamer2);
			System.out.println("Gamer1 Win !!");
		} else if (gamer1 == gamer2) {
			System.out.println("Gamer1's choice:" + gamer1 + "\nGamer2's choice:" + gamer2);
			System.out.println("It's a tie !!");
		} else {
			System.out.println("Gamer1's choice:" + gamer1 + "\nGamer2's choice:" + gamer2);
			System.out.println("Gamer2 Win !!");
		}
		System.out.println("Finished!!");
	}

}
