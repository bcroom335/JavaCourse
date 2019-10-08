package tw.bcroom335.javaproject.oop.encapsulation;

class Encapsulation{

	private int a=1;
	public int b=2;
	
	public void action() {
		System.out.println("Do Something.....");
	}	
	private void action2() {
		System.out.println("Play");
	}
	


}

public class TestEncapsulationEx1 {

	public static void main(String[] args) {
		Encapsulation encap1=new Encapsulation();
		//System.out.println("encap1.a="+encap1.a);
		System.out.println("encap1.b="+encap1.b);
		encap1.action();
		//encap1.action2();  //compile error
		

	}

}
