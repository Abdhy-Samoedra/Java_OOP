package UAS_Practice;

public class MyRunnable implements Runnable{
	
	private int threadNumber;
	

	public MyRunnable(int threadNumber) {
		this.threadNumber = threadNumber;
	}


	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Thread #2 : "+ i+" from"+threadNumber);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Thread 2 finish");
		
	}

}
