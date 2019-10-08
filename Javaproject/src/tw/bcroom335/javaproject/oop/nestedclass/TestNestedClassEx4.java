package tw.bcroom335.javaproject.oop.nestedclass;

public class TestNestedClassEx4 {

	public void processaction(Fish fish) {
		fish.eat();
	}
	
	public static void main(String[] args) {
		Fish swordfish=new Fish() {
			public void eat() {
				System.out.println("eat fish");
			}
		};
//		swordfish.eat();
		
		TestNestedClassEx4 test4=new TestNestedClassEx4();

//		test4.processaction(swordfish);
		
		test4.processaction(new Fish() {
			public void eat() {
				System.out.println("eat bigfish");
			}
		});

		
	}
	
	
}
