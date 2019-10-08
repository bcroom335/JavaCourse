package tw.bcroom335.javaproject.oop.Inheritance;

class parent{
	String name="jack";
	public parent() {		
	}
	
	public parent(String name) {
		this.name=name;
	}
	
	public void sayHello() {
		System.out.println("Hi~"+name);
	}
}

class child extends parent{
	
	public child(){
	super("mary");	
	}
	
	public void sayNo() {
		System.out.println("No........");
		super.sayHello();
	}
}

public class CallTestInheritanceEx1 {

	public static void main(String[] args) {
		child kid=new child();
		//kid.name="Lin";
		//kid.sayHello();
		kid.sayNo();

	}

}
