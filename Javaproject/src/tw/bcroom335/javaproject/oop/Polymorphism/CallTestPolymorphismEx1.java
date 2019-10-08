package tw.bcroom335.javaproject.oop.Polymorphism;

class mammal{
	public void happy() {
		System.out.println("mammal happy");
	}
	public static void processAction(mammal m) {//mammul m=garfield;-->mammul m=new cat();
		m.happy();								//mammul m=new dog();
		if(m instanceof cat) {
		  cat c1=(cat)m;
		  c1.jumpAway();
		 }
		if(m instanceof dog) {
		  dog d1=(dog)m;
		  d1.biteBone();
		}
	}
}

class cat extends mammal{
	@Override
	public void happy() {
		System.out.println("Mouw Mouw....");
	}
	public void jumpAway() {
		System.out.println("Cat jumps away");
	}
}

class dog extends mammal{
	@Override
	public void happy() {
		System.out.println("Wong Wong....");
	}
	public void biteBone() {
		System.out.println("Dog bites bone");
	}
}

public class CallTestPolymorphismEx1 {

	public static void main(String[] args) {
//		mammal m=new mammal();
//		cat kitty=new cat();
//		m=kitty;
		
//		mammal m1=new cat();
//		mammal m2=new dog();
//		m1.happy();
//		m2.happy();
		
//		mammal m;
//		m=new cat();
//		m.happy();
//		m=new dog();
//		m.happy();
		cat garfield=new cat();
		mammal.processAction(garfield);
		mammal.processAction(new dog());

	}

}
