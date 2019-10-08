package tw.bcroom335.javaproject.oop.array;

public class Test2DimArrayEx1 {

	public static void main(String[] args) {
		int[][] data= {{1,2,3},{4,5,6,7,8}};
		for(int i=0;i<data.length;i++) {
			for(int j=0;j<data[i].length;j++) {
				System.out.printf("data[%d][%d]=%d\n",i,j,data[i][j]);
			}
		}

	}

}
