package commontask;

import java.util.concurrent.TimeUnit;

public class LoopTaskA  implements Runnable{

	private static int  count=0;
	private int id;
	
	public void run() {
		System.out.println( "#########id  "+id +"> STARTING");
		for(int i =1;i<=10;i++)
		{
			System.out.println( "id  "+id +"> Tick tick " +i);
			
			try {
				TimeUnit.MILLISECONDS.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println( "#########id  "+id +"> done");
	}
	
	public LoopTaskA() {
	  id = ++count;
	
	}
	}

	
	

