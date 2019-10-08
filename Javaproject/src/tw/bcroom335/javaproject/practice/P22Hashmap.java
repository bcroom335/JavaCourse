package tw.bcroom335.javaproject.practice;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class P22Hashmap {

	public static void main(String[] args) {
		HashMap map1=new HashMap();
		map1.put("1st", "Allen");
		map1.put("2nd", "Armin");
		map1.put("3rd", "Mikasa");
		map1.put("3rd", "Sasha");
		
		Set key = map1.keySet();
		Collection value = map1.values();
		Set map = map1.entrySet();
		
		String data=(String)map1.get("1st");
		
		System.out.println("key:"+key);
		System.out.println("value:"+value);
		System.out.println("map:"+map);
		System.out.println("data:"+data);
		

	}

}
