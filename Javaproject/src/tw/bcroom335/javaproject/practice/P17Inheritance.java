package tw.bcroom335.javaproject.practice;

class parent{
	String name="Keroro";
	public parent() {		
	}
	public parent(String name) {
		this.name=name;
	}
	
	public void sayHello() {
		System.out.println("Hi~~~");
	}	
}

class kid extends parent{
	public void sayNo() {
		System.out.println("No....");
		super.sayHello();
	}
}

public class P17Inheritance {

	public static void main(String[] args) {
		kid child=new kid();
		child.sayNo();
		child.name="Dororo";
		System.out.println(child.name);
	}

}
