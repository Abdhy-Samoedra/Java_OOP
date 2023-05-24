package UAS_Practice;

public class CobaThread {
    public static void main(String[] args) {
//        Thread p1 = new proses1();
//        Thread p2 = new proses2();
//
//        p1.start();
//        p2.start();
        Runnable worker = new WorkerRunnable();
        Thread workerThread1 = new Thread(worker);
        Thread workerThread2 = new Thread(worker);
        workerThread1.start();
        workerThread2.start();
    }
}
class proses1 extends Thread{
    @Override
    public void run() {
        try {
            sleep(200); // untuk mendelay
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Proses 1 jalan");
    }
}
class proses2 extends Thread{
    @Override
    public void run() {
        System.out.println("Proses 2 jalan");
    }
}

class WorkerRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("Hallo");
    }
}
