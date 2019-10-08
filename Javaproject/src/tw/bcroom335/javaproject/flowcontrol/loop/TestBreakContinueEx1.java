package tw.bcroom335.javaproject.flowcontrol.loop;

public class TestBreakContinueEx1 {

	public static void main(String[] args) {
		int i = 1;
		while (i <= 10) {
			
			if( i ==5) {
				break;
				//continue;
			}
			System.out.println("i=" + i);
			i++; 
		}
         System.out.println("finish~~~");
	}

}
