package tw.bcroom335.javaproject.oop.collection;

import java.util.LinkedList;

public class TestQueueWithLinkedListEx1 {
	@SuppressWarnings("rawtypes")
	private LinkedList queue;
	@SuppressWarnings("unchecked")
	public void processStoreQueue(){
		 queue = new LinkedList();
		 queue.offer("signal");
		 queue.offer("sun");
	}
	
	public void processRetrieveQueue() {
		while(queue.peek()!=null) {
			String info =(String)queue.poll();
			System.out.println("info:"+info);
		}
	}
	
	public static void main(String[] args) {
		TestQueueWithLinkedListEx1 test1=new TestQueueWithLinkedListEx1();
		test1.processStoreQueue();
		test1.processRetrieveQueue();

	}

}
