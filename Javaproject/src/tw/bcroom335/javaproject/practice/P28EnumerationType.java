package tw.bcroom335.javaproject.practice;

enum Poker{
	Spade,Heart,Diamond("John"),Club;
	
	private String name="Linda";
	Poker(){
		System.out.println("name:"+name);
	}
	private Poker(String name) {
		this.name=name;
	}
	void showMsg(){
		System.out.println("Hi,"+name);
	}
	
}

public class P28EnumerationType {

	public static void main(String[] args) {
		Poker suit=Poker.Diamond;
		switch(suit) {
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
		Poker[] mySuit=Poker.values();
		for(Poker name:mySuit) {
			//System.out.println(name+":"+name.ordinal());
			name.showMsg();
		}
	}

}
