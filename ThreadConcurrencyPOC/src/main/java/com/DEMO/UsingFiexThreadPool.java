package com.DEMO;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import commontask.LoopTaskA;

public class UsingFiexThreadPool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("main thread start here");
		
		ExecutorService executorService = Executors.newFixedThreadPool(6);
		//ExecutorService executorService = Executors.newCachedThreadPool();
		executorService.execute(new LoopTaskA());
		executorService.execute(new LoopTaskA());
		executorService.execute(new LoopTaskA());
		executorService.execute(new LoopTaskA());
		executorService.execute(new LoopTaskA());
		executorService.execute(new LoopTaskA());
		
		executorService.shutdown();
	//	executorService.execute(new LoopTaskA());
		System.out.println("main thread stop here");
		
	}

}
