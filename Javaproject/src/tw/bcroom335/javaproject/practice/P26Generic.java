package tw.bcroom335.javaproject.practice;

class Generictest<T>{
	private T t1;
	public T getT1() {
		return t1;
	}
	public void setT1(T t1) {
		this.t1=t1;
	}
}

public class P26Generic {

	public static void main(String[] args) {
		Generictest<Integer> test = new Generictest<Integer>();
		test.setT1(2);
		int value=test.getT1();
		System.out.println("value+1:"+(value+1));
		

	}

}
