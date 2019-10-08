package tw.bcroom335.javaproject.oop.thread;

class Maze {
	private int x = 0, y = 0;

	public void move(int x, int y) {
		synchronized (this) {
			this.x = x;
			this.y = y;
			System.out.println("x:" + x + " y:" + y);
			this.notify();
		}
	}

	public void checkexit() {
		synchronized (this) {
			try {
				this.wait();
				if (x == 0 & y == 0) {
					System.out.println("i am survived.");
					System.exit(-1);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Hero implements Runnable {
	private Maze core;

	public Hero(Maze core) {
		this.core = core;
	}

	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep((int) (Math.random() * 400) + 400);
				int x = (int) (Math.random() * 5);
				int y = (int) (Math.random() * 5);
				core.move(x, y);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Checkpoint implements Runnable{
	private Maze core;
	public Checkpoint(Maze core) {
		this.core=core;
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				core.checkexit();
				Thread.sleep((int)(Math.random()*400));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class MazeGame {

	public static void main(String[] args) {
		Maze core = new Maze();
		
		Hero Emiya = new Hero(core);
		Thread threadA = new Thread(Emiya);
		threadA.start();
		
		Checkpoint check=new Checkpoint(core);
		Thread threadB=new Thread(check);
		threadB.start();
		}

}
