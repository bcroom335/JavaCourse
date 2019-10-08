package tw.bcroom335.javaproject.practice;


class threadPractice implements Runnable{

	@Override
	public void run() {
		for(int i=1;i<10;i++) {
			System.out.println(Thread.currentThread().getName()+" i="+i);
//			System.out.print(Thread.currentThread().getName());
//			System.out.println(" i="+i);
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}		
	}	
}

public class P33Thread {

	public static void main(String[] args) {
		threadPractice test=new threadPractice();
		Thread thread1 = new Thread(test);
		Thread thread2 = new Thread(test);
		
		thread1.run();
		thread2.run();
		
//		try {
//			thread1.join();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}

	}

}
