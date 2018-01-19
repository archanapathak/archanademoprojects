package com.DEMO;

import java.util.concurrent.TimeUnit;

public class Threadex2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("main thread start here ");
         new SecondTask().start();
        Thread t =  new SecondTask();
        t.start();
        System.out.println("main thread ends here");
	}

}
class SecondTask extends Thread
{
	private static int  count=0;
	private int id;
	@Override
	public void run() {
	
		for(int i =1;i<=10;i++)
		{
			System.out.println( "id  "+id +"> Tick tick " +i);
			
			try {
				TimeUnit.MILLISECONDS.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public SecondTask() {
	  id = ++count;
		
	}
}




