package tw.bcroom335.javaproject.oop.collection;

import java.util.HashSet;

public class TestSetEx1 {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		HashSet set1=new HashSet();
		
		set1.add("john");
		set1.add("mary");
		set1.add("mary");
		set1.add(6);
		set1.add(new Integer(6));
		set1.add(3.141856);
		
		System.out.println("size1:"+set1.size());
		System.out.println("set1:"+set1);
		
		set1.remove("mary");
		System.out.println("size2:"+set1.size());
		System.out.println("set2:"+set1);

	}

}
