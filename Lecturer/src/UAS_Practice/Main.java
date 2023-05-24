package UAS_Practice;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		Thread.currentThread().setPriority(10);
//		System.out.println(Thread.currentThread().getPriority());
//		System.out.println(Thread.activeCount());
//		for (int i = 0; i < 3; i++) {
//			System.out.println(i);
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		MyThread thread1 = new MyThread();
//		thread1.start();
//		thread1.setName("Thread1");
//		System.out.println(thread1.getName());
//		thread1.setPriority(10);
//		System.out.println(thread1.getPriority());
//		
//		MyThread thread2 = new MyThread();
//		thread2.start();
//		thread2.setName("Thread2");
//		System.out.println(thread2.getName());
//		thread2.setPriority(10);
//		System.out.println(thread2.getPriority());
//		
//		System.out.println(Thread.activeCount());
		
		for (int i = 0; i < 3; i++) {
			MyRunnable runnable1 = new MyRunnable(i);
			Thread thread1 = new Thread(runnable1);
			thread1.start();
		}
		
		//kalau extend Thread
//		MyThread thread1 = new MyThread();
		
		//kalau implement runnable mending pakai yang ini aja
//		MyRunnable runnable1 = new MyRunnable();
//		Thread thread2 = new Thread(runnable1);
//		
//		thread1.start();
//		thread1.join();
//		thread2.start();
	}

}
