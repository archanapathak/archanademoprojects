package com.DEMO;
class MyThread1 extends Thread{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
	
		for(int i=1;i<30;i++)
		{
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	
	public MyThread1() {
		// TODO Auto-generated constructor stub
	
	   start();
	}
	
}



public class DaemonThreadDemo  {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub

		Thread t1 = new MyThread1();
		Thread t2 = new MyThread1();
		Thread t3 = new MyThread1();
		t1.setDaemon(true);
		t1.start();
		
		t2.start();
		t3.start();
		
	}

}
