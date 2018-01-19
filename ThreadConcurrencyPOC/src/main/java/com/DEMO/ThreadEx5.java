package com.DEMO;

import java.util.concurrent.TimeUnit;

public class ThreadEx5 {

	
	public static void main(String[] args) {
		
		System.out.println("main thread start here");
		
		new Thread(new Runnable() {
			
			public void run() {
				// TODO Auto-generated method stub
				for(int i =1;i<=10;i++)
				{
					System.out.println( " Tick tick " +i);
					
					try {
						TimeUnit.MILLISECONDS.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}	
			}
		}).start();
		System.out.println("main thread stop here");
	}
}
