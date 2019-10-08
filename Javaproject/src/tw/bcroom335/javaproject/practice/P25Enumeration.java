package tw.bcroom335.javaproject.practice;

import java.util.Enumeration;
import java.util.Properties;

public class P25Enumeration {

	public static void main(String[] args) {
		Properties p1 = System.getProperties();
		Enumeration<?> e1 = p1.propertyNames();
		while(e1.hasMoreElements()) {
			String key=(String)e1.nextElement();
			String value=(String)p1.get(key);
			System.out.println(key+":"+value);
		}

	}

}
