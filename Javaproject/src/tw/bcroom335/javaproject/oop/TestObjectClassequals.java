package tw.bcroom335.javaproject.oop;

class car{
	int price=2000000;
	String brand="iii";
}

public class TestObjectClassequals {

	public static void main(String[] args) {
		car car1=new car();
		car car2=new car();
		
		System.out.println("car1==car2:"+(car1==car2));
		System.out.println("car1.equals(car2):"+(car1.equals(car2)));
		
		car1=car2;
		System.out.println("car1==car2:"+(car1==car2));
		System.out.println("car1.equals(car2):"+(car1.equals(car2)));
		}

}
