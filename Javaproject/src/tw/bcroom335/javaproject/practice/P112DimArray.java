package tw.bcroom335.javaproject.practice;

public class P112DimArray {

	public static void main(String[] args) {
		int[][] data= {{9,8,7},{1,2,3,4,5}};
		for(int i=0;i<data.length;i++) {
			for(int j=0;j<data[i].length;j++) {
				System.out.printf("data[%d][%d]=%d\n",i,j,data[i][j]);
			}
		}
	}
}
