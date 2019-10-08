package tw.bcroom335.javaproject.oop.nestedclass;

//Anonymous Nester Class

abstract class Fish{
	abstract void eat();
}

//class Shark extends Fish{
//	@Override
//	void eat() {
//		System.out.println("eat small fish");
//	}
//}

public class TestNestedClassEx3 {

	public static void main(String[] args) {
//		Shark makoshark=new Shark();
//		makoshark.eat();
		
		new Fish(){
			@Override
			void eat() {
				System.out.println("eat everything");				
			}
		}.eat();
	}

}
