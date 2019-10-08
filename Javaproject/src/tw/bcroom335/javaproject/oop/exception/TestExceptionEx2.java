package tw.bcroom335.javaproject.oop.exception;

public class TestExceptionEx2 {
	public void divide(int a,int b) {
		try {
		System.out.println("a/b="+(a/b));
	     }catch(ArithmeticException e) {
	    	 e.printStackTrace();
	    	 System.exit(1);
	     }catch(Exception e) {
	    	 System.out.println("e1"+e);
	     }finally {
	    	 System.out.println("Done");
	     }
	}
	public static void main(String[] args) {
		TestExceptionEx2 excep2=new TestExceptionEx2();
		excep2.divide(6, 0);
	}

}
