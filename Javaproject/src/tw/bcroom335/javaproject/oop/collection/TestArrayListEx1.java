package tw.bcroom335.javaproject.oop.collection;

import java.util.ArrayList;

public class TestArrayListEx1 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		ArrayList list1=new ArrayList();
		
		list1.add("john");
		list1.add("mary");
		list1.add("mary");
		list1.add(6);
		list1.add(new Integer(6));
		list1.add(3.141856);
		
		System.out.println("list1_1:"+list1);
		
		list1.add(2, "lin");
		System.out.println("list1_2:"+list1);
		
		String data=(String)list1.get(2);
		System.out.println("data:"+data);
		

  }
}
