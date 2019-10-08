package tw.bcroom335.javaproject.HW;

public class HW6StatisticsOrder {
	
	int[] count = new int[42];
	int[] number = new int[42];
	
	public void createLotteryNumber() {
		for (int i = 1; i <= 100000; i++) {
			int rNum = (int) (Math.random() * 42 + 1);
			//System.out.println("rNum:" + rNum);
			count[rNum-1]++;
		}
		
		for(int j=1;j<=42;j++) {
			number[j-1] = j;
		}
	}
	
	
	public void numberSort() {
		for (int i = 0; i < count.length - 1; i++) {

			for (int j = i + 1; j < count.length; j++) {
				int temp1 = 0, temp2=0;

				if (count[i] < count[j]) {
					temp1 = count[i];
					count[i] = count[j];
					count[j] = temp1;
					
					temp2 = number[i];
					number[i] = number[j];
					number[j] = temp2;
				}
			}

		}
	}
	
	
	public void printResult() {
		for(int k=0;k<count.length;k++) {
			System.out.printf("%d:%d\n", number[k], count[k]);
		}
	}

	public static void main(String[] args) {
		
		HW6StatisticsOrder lottery=new HW6StatisticsOrder();
		
		lottery.createLotteryNumber();
		
		System.out.println("Original data:");
		System.out.println("----------------------------------");
		
		lottery.printResult();
		
		System.out.println("----------------------------------");
		
		lottery.numberSort();
		
		System.out.println("Sorted data:");
		System.out.println("----------------------------------");
		
		lottery.printResult();
		
		System.out.println("----------------------------------");
	}

}
