package tw.bcroom335.javaproject.practice;

import java.util.ArrayList;
import java.util.ListIterator;

public class P24TestIterator {

	public static void main(String[] args) {
		ArrayList<String> fruit=new ArrayList<String>();
		fruit.add("Orange");
		fruit.add("Grape");
		fruit.add("Peach");
		fruit.add("Kiwi");
		fruit.add("banana");
		
		System.out.println("fruit:"+fruit);
		
		ListIterator<String> li=fruit.listIterator(3);
		
		ListIterator<String> li2=fruit.listIterator();
		
		while(li2.hasNext()) {
			System.out.println(li2.next());
		}
		
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}

	}

}
