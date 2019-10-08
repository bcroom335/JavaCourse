package tw.bcroom335.javaproject.oop.exception;

public class TestExceptionEx1 {
	public void testexception() {
		int[] data= {1,2,3,4,5};
		try {
		for(int i=0;i<=data.length;i++) {
			System.out.printf("data[%d]=%d\n",i,data[i]);
		}
		}catch(ArrayStoreException e) {
			System.out.println("hi");
			System.out.println("e1:"+e);
			e.printStackTrace();
		}catch(Exception e) {
			System.out.println("e2:" + e);
		}
	}
	public static void main(String[] args) {
		TestExceptionEx1 except1=new TestExceptionEx1();
		except1.testexception();

	}

}
