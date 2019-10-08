package tw.bcroom335.javaproject.practice;

import java.util.LinkedList;

public class P23QueqewithLinkedlist {
	
	public LinkedList queqe;

	public void processstore() {
		queqe=new LinkedList();
		queqe.offer("tree");
		queqe.offer("flower");
	}
	
	public void processretrieve() {
		while(queqe.peek()!=null) {
			System.out.println("info:"+(String)queqe.poll());
		}
	}
	
	public static void main(String[] args) {
		P23QueqewithLinkedlist test1= new P23QueqewithLinkedlist();
		test1.processstore();
		test1.processretrieve();
	}

}
