package tw.bcroom335.javaproject.practice;

import java.util.HashSet;

public class P20Set1 {

	public static void main(String[] args) {
		HashSet set1=new HashSet();
		set1.add("mary");
		set1.add("john");
		set1.add("john");
		set1.add(6);
		set1.add(new Integer(8));
		set1.add(3.141582);
		
		System.out.println("set1:"+set1);
		System.out.println("size1:"+set1.size());
		
		set1.remove("john");
		System.out.println("set2:"+set1);
		System.out.println("size2:"+set1.size());

	}

}
