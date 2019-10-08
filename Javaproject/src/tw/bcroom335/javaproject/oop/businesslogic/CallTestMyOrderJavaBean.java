package tw.bcroom335.javaproject.oop.businesslogic;

public class CallTestMyOrderJavaBean {

	public void processBean(TestMyOrderJavaBean Bean) {
		System.out.println(Bean.getOrderNumber());
		System.out.println(Bean.getCustomer());
		System.out.println(Bean.getOrderAddress());
		System.out.println(Bean.getOrderPhone());
	}
	
	public static void main(String[] args) {
		TestMyOrderJavaBean orderBean=new TestMyOrderJavaBean();
		orderBean.setOrderNumber("201907190002");
		orderBean.setCustomer("john");
		orderBean.setOrderAddress("Sun");
		orderBean.setOrderPhone("334-5678");
		
		CallTestMyOrderJavaBean test1=new CallTestMyOrderJavaBean();
		test1.processBean(orderBean);

	}

}
