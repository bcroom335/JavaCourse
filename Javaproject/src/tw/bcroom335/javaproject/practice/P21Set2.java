package tw.bcroom335.javaproject.practice;

import java.util.HashSet;
import java.util.TreeSet;

public class P21Set2 {

	public static void main(String[] args) {
		HashSet luckyNum=new HashSet();
		while(luckyNum.size()<6) {
			int chooseNum=(int)(Math.random()*42+1);
			luckyNum.add(chooseNum);
		}
		System.out.println("Luckynumber:"+luckyNum);
		
		TreeSet ts=new TreeSet(luckyNum);
			System.out.println("Luckynumber:"+ts);	
	}

}
