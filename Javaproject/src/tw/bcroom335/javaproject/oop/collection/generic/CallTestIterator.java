package tw.bcroom335.javaproject.oop.collection.generic;

import java.util.ArrayList;
import java.util.ListIterator;

public class CallTestIterator {

	public static void main(String[] args) {
		ArrayList<String> fruit = new ArrayList<String>();
		fruit.add("Apple");
		fruit.add("Guava");
		fruit.add("Banana");
		fruit.add("Pineapple");
		fruit.add("Peach");
		fruit.add("Kiwi");
		
		System.out.println("fruit:"+fruit);
		
//		ListIterator<String> i1 = fruit.listIterator();
//		while(i1.hasNext()) {
//			System.out.println(i1.next());
//		}
		
		ListIterator<String> i2 = fruit.listIterator(3);
		while(i2.hasPrevious()) {
			System.out.println(i2.previous());
		}

	}

}
