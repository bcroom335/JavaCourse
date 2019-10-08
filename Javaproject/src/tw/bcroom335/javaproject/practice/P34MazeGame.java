package tw.bcroom335.javaproject.practice;

class mazeTest{
	private int x=0,y=0;
	public void move(int x,int y) {
		synchronized(this) {
			this.x=x;
			this.y=y;
			System.out.println("X:"+x+" Y:"+y);
			this.notify();
			}
		}

	public void exit() {
		synchronized(this) {
			try {
				this.wait();
				if(x==0 & y==0) {
					System.out.println("I'm survived");
					System.exit(-1);
				}
			}catch (InterruptedException e) {
				e.printStackTrace();
			}			
		}
	}
}

class player1 implements Runnable{
	private mazeTest core;
	
	public player1(mazeTest core) {
		this.core=core;
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(((int)Math.random()*400)+400);
				int x=(int)(Math.random()*5);
				int y=(int)(Math.random()*5);
				core.move(x, y);
			} catch (InterruptedException e) {
			e.printStackTrace();
			}
		}		
	}	
}

class exitcheck implements Runnable{
	private mazeTest core;
	
	public exitcheck(mazeTest core) {
		this.core=core;
	}
	
	@Override
	public void run() {
		while(true) {
		try {
			core.exit();
			Thread.sleep((int)Math.random()*400);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
	}
	
}

public class P34MazeGame {

	public static void main(String[] args) {
		mazeTest core=new mazeTest();
		player1	tester=new player1(core);
		Thread threadA=new Thread(tester);
		threadA.start();
		
		exitcheck check=new exitcheck(core);
		Thread threadB=new Thread(check);
		threadB.start();
	}
}
