package tw.bcroom335.javaproject.oop.nestedclass;

class C{
	private static int age=18;
	
	static class D{
		public static void show() {
			System.out.println("Show talent. age above"+age+"+");
		}
	}
}

class E{
	private String direction="North";
	public void sendDirection() {
		double latitude=51.280604, longtitude=30.208421;
		
		class F{
			public void guide() {
			System.out.println("latitude:"+latitude+"\nlongtitude:"+longtitude+"\nDirection:"+direction);
			}
		}
		F f1=new F();
		f1.guide();
	}
}

public class TestNestedClassEx2 {

	public static void main(String[] args) {
		C.D d1=new C.D();
		d1.show();
		
		E e1=new E();
		e1.sendDirection();
	}
}
