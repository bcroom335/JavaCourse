package tw.bcroom335.javaproject.oop.overload;

public class CallTestOverloading {
	public void sum(int x,int y) {
		System.out.println("x+y="+(x+y));
	}
	public void sum(double a,double b) {
		System.out.println("a+b="+(a+b));
	}
	
	public static void main(String[] args) {
		CallTestOverloading overloading=new CallTestOverloading();
		overloading.sum(1,2);
		overloading.sum(3.1,6.289);
		overloading.sum('c',2);
	}

}
