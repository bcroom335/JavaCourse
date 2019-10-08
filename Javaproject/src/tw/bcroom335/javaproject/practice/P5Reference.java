package tw.bcroom335.javaproject.practice;

class shoes{
	int price=1000;
	char size='M';
}

public class P5Reference {

	public static void main(String[] args) {
		shoes myshoes=new shoes();
		shoes yourshoes=new shoes();

		System.out.println("myshoes.price:"+myshoes.price);
		System.out.println("myshoes.size:"+myshoes.size);
		
		myshoes.price=3000;
		myshoes.size='L';
		
		System.out.println("myshoes.price:"+myshoes.price);
		System.out.println("myshoes.size:"+myshoes.size);
		System.out.println("Finished");
	}

}
