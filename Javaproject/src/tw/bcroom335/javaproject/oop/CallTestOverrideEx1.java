package tw.bcroom335.javaproject.oop;

class Animal{
	public void eat() {
		System.out.println("eat food.");
	}
}

class Lion extends Animal{
	public void eat() {
		System.out.println("eat meat.");
	}
	
	public void bite() {
		System.out.println("bite hipo.");
	}
}

public class CallTestOverrideEx1 {

	public static void main(String[] args) {
		Lion Simba=new Lion();
		Simba.bite();
		Simba.eat();
		
		

	}

}
