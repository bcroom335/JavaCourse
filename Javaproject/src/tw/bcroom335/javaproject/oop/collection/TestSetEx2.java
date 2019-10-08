package tw.bcroom335.javaproject.oop.collection;

import java.util.HashSet;
import java.util.TreeSet;

public class TestSetEx2 {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		HashSet luckNum=new HashSet();
		while(luckNum.size()<6) {
			int chooseNum=(int)(Math.random()*42+1);
			luckNum.add(chooseNum);
		}
		final TreeSet ts = new TreeSet(luckNum);

        ts.comparator();

        System.out.println("luckyNumber:"+luckNum);
		System.out.println("luckyNumber:"+ts);

	}

}
