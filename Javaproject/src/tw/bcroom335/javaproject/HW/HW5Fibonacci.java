package tw.bcroom335.javaproject.HW;

public class HW5Fibonacci {
	public int f(int n){
		if((n-1)==0||(n-1)==1) {
			return (n-1);
		}
		return f(n-1)+f(n-2);
		
	}
	public static void main(String[] args) {
		HW5Fibonacci fibo=new HW5Fibonacci();
		for(int i=1;i<10;i++) {			
			int value=fibo.f(i);
			System.out.println(i+"."+value);
		}

	}

}
