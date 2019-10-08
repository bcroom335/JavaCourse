package tw.bcroom335.javaproject.practice;

class Person {
	public void sayHello() {
		System.out.println("Hola.");
		sayGoodBye();
	}
	public void sayGoodBye() {
		System.out.println("Adios.");
	}
}

public class P1CallMethod1 {

	public static void main(String[] args) {
		Person Mike = new Person();
		Mike.sayHello();
		// Mike.sayGoodBye();
		System.out.println("Finished.");
	}

}
