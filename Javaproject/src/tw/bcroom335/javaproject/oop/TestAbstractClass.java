package tw.bcroom335.javaproject.oop;

abstract class company{
	public abstract void calFuel();
	public abstract void calDistance();
	
	public static void processAction(company UPS) {
		UPS.calFuel();
		UPS.calDistance();
	} 
}

class Truck extends company{
	@Override
	public void calFuel() {
		System.out.println("Calcaulate Fuel.");
	}
	public void calDistance() {
		System.out.println("Calcaulate Distance.");
	}
}

class Ship extends company{
	@Override
	public void calFuel() {
		System.out.println("Calcaulate Fuel.");
	}
	public void calDistance() {
		System.out.println("Calcaulate Distance.");
	}
}

public class TestAbstractClass {

	public static void main(String[] args) {
//		company UPS;
//		UPS =new Truck();
//		UPS.calDistance();
//		UPS.calFuel();
//		
//		UPS =new Ship();
//		UPS.calFuel();
//		UPS.calDistance();
		
		company.processAction(new Truck());
		company.processAction(new Ship());
	}

}
