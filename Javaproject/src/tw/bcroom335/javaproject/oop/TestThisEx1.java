package tw.bcroom335.javaproject.oop;

public class TestThisEx1 {

	int x;
	int y;

	public  TestThisEx1() {
		//this(6);
		System.out.println("TestThisEx1()");
		
	}

	public TestThisEx1(int number) {
		System.out.println("TestThisEx1(int level):" + number);
	}

	public void changeValue(int x, int y) {
		this.x = x;
		this.y = y;
		//System.out.println("this:" + this);
	}

	public static void main(String[] args) {
		TestThisEx1 test1 = new TestThisEx1();
		test1.changeValue(3, 7);

		//System.out.println("test1:" + test1);

		System.out.println("test1.x=" + test1.x);
		System.out.println("test1.y=" + test1.y);

	}

}
