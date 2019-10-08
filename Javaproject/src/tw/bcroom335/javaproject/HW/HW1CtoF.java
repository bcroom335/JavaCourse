package tw.bcroom335.javaproject.HW;

public class HW1CtoF {

	public static void main(String[] args) {
		int index=1;
		int degree=0;
		if(index==1) {
			double F=degree*(9.0/5)+32;
			System.out.println(degree+"C="+F+"F");
		}else if(index==2) {
			double C=(degree-32)/(9.0/5);
			System.out.println(degree+"F="+C+"C");
		}
			System.out.println("Finished.");
	}

}
