package tw.bcroom335.javaproject.practice;

class Animal{
	public void happy() {
		System.out.println("Animal happy");
	}
	public static void action(Animal m) {
		m.happy();
		if(m instanceof Cat) {
			Cat c1=(Cat) m;
			c1.jumpAway();
		}
		if(m instanceof Dog) {
			((Dog) m).Bite();
		}
	}
}

class Cat extends Animal{
	@Override
	public void happy() {
		System.out.println("Mauw~~ Mauw~~");
	}
	public void jumpAway(){
		System.out.println("Cat Jump!!");
	}
}

class Dog extends Animal{
	@Override
	public void happy() {
		System.out.println("Wong~~ Wong~~");
	}
	public void Bite(){
		System.out.println("Bite Bone!!");
	}
}

public class P18Polymorphism {

	public static void main(String[] args) {
//		Cat kitty=new Cat();
//		kitty.happy();
//		kitty.jumpAway();
//		
//		Animal m1=new Cat();
//		Animal m2=new Dog();
//		m1.happy();
//		m2.happy();
		
		Animal.action(new Cat());
		Animal.action(new Dog());
		
	}

}
