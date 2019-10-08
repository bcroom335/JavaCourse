package tw.bcroom335.javaproject.oop;

public class CallObjectClassequalsEx2 {

	public static void main(String[] args) {
		String str1="hello";  //0x1234
		String str2=new String("hello"); //0x2345
		
		System.out.println("str1==str2:"+(str1==str2));
		System.out.println("str1.equals(str2):"+str1.equals(str2));
		
		String str3=new String("Hello"); //0x3456
		System.out.println("str2==str3:"+(str2==str3));
		System.out.println("str2.equals(str3):"+str2.equals(str3));
		System.out.println("str2.equalsIgnoreCase(str3):"+str2.equalsIgnoreCase(str3));
		
		String str4="hello"; //0x1234
		System.out.println("str1==str4:"+(str1==str4));
		System.out.println("str1.equals(str4):"+str1.equals(str4));

	}

}
