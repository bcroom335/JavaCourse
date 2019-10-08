package tw.bcroom335.javaproject.oop;

interface Flyer{
	public void takeoff();
	public void fly();
	public void land();
}

abstract class creature{
	public abstract void eat();
}

class Airplane implements Flyer{
	@Override
	public void takeoff() {
		System.out.println("Airplane takes off");
	}
	@Override
	public void fly() {
		System.out.println("Airplane flies");
	}
	@Override
	public void land() {
		System.out.println("Airplane lands");
	}
}

class Bird extends creature implements Flyer{

	@Override
	public void takeoff() {
		System.out.println("Bird takes off");
	}
	@Override
	public void fly() {
		System.out.println("Bird flies");
	}
	@Override
	public void land() {
		System.out.println("Bird takes off");
	}
	@Override
	public void eat() {
		System.out.println("Bird eats Worms");	
	}
}

public class TestInterfacesEx1 {
	public static void processaction(Flyer F) {
		F.takeoff();
		F.fly();
		F.land();
		if (F instanceof Bird) {
			Bird b=(Bird) F;
			b.eat();
		}
	}

	public static void main(String[] args) {
		TestInterfacesEx1.processaction(new Airplane());
		TestInterfacesEx1.processaction(new Bird());

	}

}
