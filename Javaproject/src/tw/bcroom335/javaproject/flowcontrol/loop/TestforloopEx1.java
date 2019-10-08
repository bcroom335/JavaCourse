package tw.bcroom335.javaproject.flowcontrol.loop;

public class TestforloopEx1 {

	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%dX%d=%02d\t", i, j, i * j);
			}
				System.out.println();
		}
	}

}
