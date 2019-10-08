package tw.bcroom335.javaproject.oop.io;

class TestAutoCloseableEx1 implements AutoCloseable {

	public void processResource() {
		System.out.println("Processing Resource");
	}

	public void close() throws Exception {
		System.out.println("Resource close");
	}
}

public class CallTestAutoCloseableEx1 {

	public static void main(String[] args) {
		try (TestAutoCloseableEx1 resource = new TestAutoCloseableEx1()) {
			resource.processResource();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
