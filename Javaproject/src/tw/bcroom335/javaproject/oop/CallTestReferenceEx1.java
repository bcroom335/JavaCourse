package tw.bcroom335.javaproject.oop;

class shirt {
	int price = 2000;
	char size = 'L';
}

public class CallTestReferenceEx1 {

	public static void main(String[] args) {
		shirt myshirt = new shirt();
		shirt yourshirt = new shirt();

		System.out.println("myshirt:" + myshirt);
		System.out.println("yourshirt:" + yourshirt);

		myshirt.price = 5000;
		myshirt.size = 'M';
		System.out.println("myshirt.price:" + myshirt.price);
		System.out.println("myshirt.size:" + myshirt.size);

		yourshirt.price = 8000;
		yourshirt.size = 'S';
		System.out.println("yourshirt.price:" + yourshirt.price);
		System.out.println("yourshirt.size:" + yourshirt.size);

		yourshirt = myshirt;

		System.out.println("myshirt_1:" + myshirt);
		System.out.println("yourshirt_1:" + yourshirt);

		yourshirt.price = 7777;
		yourshirt.size = 'X';

		System.out.println("myshirt.price_1:" + myshirt.price);
		System.out.println("myshirt.size_1:" + myshirt.size);

	}

}
