package tw.bcroom335.javaproject.flowcontrol;

public class TestNestedIfEx1 {

	public static void main(String[] args) {
		int Number=-15;
		if(Number>=3) {
			System.out.println("First Step!");
			if(Number<13){
				System.out.println("Number="+Number);
							}
            System.out.println("Second Step!!");	
		}
		System.out.println("Keep Writing JAVA~~~~~");

	}

}
