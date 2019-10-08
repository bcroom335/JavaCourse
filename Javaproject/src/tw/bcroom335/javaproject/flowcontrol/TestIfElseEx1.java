package tw.bcroom335.javaproject.flowcontrol;

public class TestIfElseEx1 {

	public static void main(String[] args) {
		int  Dicenumber,Yournumber;
		Yournumber=3;
		Dicenumber=(int)(Math.random()*6+1);
		System.out.println("Dicenumber="+Dicenumber);
		if(Dicenumber==Yournumber) {
			System.out.println("You Win !! ");
		}
		else {
			System.out.println("Try Again!!");
					}
        System.out.println("Keep Writing Java~~~~");
	}

}
