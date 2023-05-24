package UAS_Practice;

public class MyThread extends Thread{
	public void run() {
		for (int i = 5; i > 0; i--) {
			System.out.println("Threas #1 : "+ i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Thread 1 finish");
	}
}
 