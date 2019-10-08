package tw.bcroom335.javaproject.oop.EnumerateType;

enum Poker{
	Spade,Heart("Julie"),Diamond,Club;
	
	private String name="Mary";
	
	private Poker() {
		System.out.println("Name:"+name);
	}
	Poker(String name) {
		this.name=name;
	}
	public void showMsg() {
		System.out.println("Hi,"+name);
	}
	
}

public class CallTestEnumeratedTypeEx1 {

	public static void main(String[] args) {
		Poker Suit=Poker.Heart;
		switch(Suit){
			case Spade:
				System.out.println(Poker.Spade);
				break;
			case Heart:
				System.out.println(Poker.Heart);
				break;
			case Diamond:
				System.out.println(Poker.Diamond);
				break;
			case Club:
				System.out.println(Poker.Club);
				break;
			default:
				assert false; 
		  }
		Poker[] mysuit=Poker.values();
		for(Poker name:mysuit) {
			System.out.println(name+":"+name.ordinal());
			name.showMsg();
		}
		

	}

}
