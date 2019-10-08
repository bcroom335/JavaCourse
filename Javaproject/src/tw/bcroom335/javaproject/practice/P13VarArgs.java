package tw.bcroom335.javaproject.practice;

public class P13VarArgs {
	public void plus(int...number) {
		int total=0;
		for(int value:number) {
			total=value+total;
		}
		System.out.println("total:"+total);
	}

	public static void main(String[] args) {
		P13VarArgs	VarArg1=new P13VarArgs();
		VarArg1.plus(9,8,7,6);
		
		int[] serial= {5,7,4,9,8,6,1};
		VarArg1.plus(serial);

	}

}
