package tw.bcroom335.javaproject.oop.businesslogic;

import java.io.Serializable;

public class TestMyOrderJavaBean implements Serializable {
	private static final long serialVersionUID = 1L;
	private String orderNumber="201907190001";
	private String customer="mary";
	private String orderAddress="Taipei";
	private String orderPhone="0987654321";
	
	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String oderNumber) {
		this.orderNumber = oderNumber;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getOrderAddress() {
		return orderAddress;
	}

	public void setOrderAddress(String oderAddress) {
		this.orderAddress = oderAddress;
	}

	public String getOrderPhone() {
		return orderPhone;
	}

	public void setOrderPhone(String oderPhone) {
		this.orderPhone = oderPhone;
	}

	public TestMyOrderJavaBean() {
		// TODO Auto-generated constructor stub
	}

}
