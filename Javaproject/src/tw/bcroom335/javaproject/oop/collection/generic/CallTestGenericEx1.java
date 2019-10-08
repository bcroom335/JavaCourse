package tw.bcroom335.javaproject.oop.collection.generic;

class TestGenerics<T>{
	private T t1;

	public T getT1() {
		return t1;
	}
	
	public void setT1(T t1) {
		this.t1 = t1;
	}
}

public class CallTestGenericEx1 {

	public static void main(String[] args) {
		TestGenerics<Integer> test1=new TestGenerics<Integer>();
		test1.setT1(7);
		int value1=test1.getT1();
		System.out.println("value1+1:"+(value1+1));
		

	}

}
