package tw.bcroom335.javaproject.oop.nestedclass;

class A{
	private String name="Snoopy";
	class B{
		public void play() {
			System.out.println("Play Baseball."+name);
		}
	}
	public void action() {
		B b1=new B();
		b1.play();
	}
}

public class TestNestedClassEx1 {

	public static void main(String[] args) {
		A a1=new A();
		a1.action();
		
		A.B b1=a1.new B();
		b1.play();
	}

}
