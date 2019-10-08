package tw.bcroom335.javaproject.oop.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class TestHashMapEx1 {

	public static void main(String[] args) {
		HashMap map1=new HashMap();
		map1.put("1st", "allen");
		map1.put("2nd", "john");
		map1.put("3rd", "Sasha");
		map1.put("3rd", "mikasa");
		Set key=map1.keySet();
		Collection value=map1.values();
		Set map=map1.entrySet();
		
		String second=(String)map1.get("2nd");
		
		System.out.println("key:"+key);
		System.out.println("value:"+value);
		System.out.println("map:"+map);
		System.out.println("second:"+second);

	}

}
