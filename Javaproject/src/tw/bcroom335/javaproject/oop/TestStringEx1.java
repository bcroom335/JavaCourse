package tw.bcroom335.javaproject.oop;

public class TestStringEx1 {

	public static void main(String[] args) {
		String data="abcdefghij";
		
		System.out.println("Length:" + data.length());
		System.out.println("data.charAt(5):" + data.charAt(5));
		System.out.println("data.toUpperCase():" + data.toUpperCase());
		System.out.println("data.substring(3, 5):" + data.substring(3, 5));
		System.out.println("data.indexOf('de'):" + data.indexOf("de"));
		System.out.println("data.startsWith('abc'):" + data.startsWith("cba"));
		
	}

}
