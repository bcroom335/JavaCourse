package tw.bcroom335.javaproject.oop.array;

public class TestEnhancedforEx1 {

	public static void main(String[] args) {
		int[] number= {1,2,3,4,5,6};
		for(int value:number) {
			System.out.println("value"+value);
		}
		int[][] data= {{1,2,3},{4,5,6,7}};
		for(int[] value:data) {
			for(int seriel:value) {
				System.out.println("seriel:"+seriel);
			}
		}
	}

}
