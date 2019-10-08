package tw.bcroom335.javaproject.practice;

public class P12Enhancedfor {

	public static void main(String[] args) {
		int[] number= {4,5,6,7};
		for(int value:number) {
			System.out.println("value"+value);
		}
		int[][] data= {{5,6,7,8},{3,5,7,9}};
		for(int[] value:data) {
			for(int seriel:value) {
				System.out.println("seriel"+seriel);
				System.out.println("value"+value);
			}
		}
	}

}
