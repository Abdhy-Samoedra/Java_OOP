package UAS_Practice;

public class CobaThread2 {
    public static void main(String[] args) {
        Runnable number = () ->{
            for (int i = 0; i < 10; i++) {
                try{
                    System.out.println(i);
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        };

        Thread t1 = new Thread(number);
        Thread t2 = new Thread(number);

        t1.start();
        t2.start();
//        t1.run();
//        t2.run();

        // kalau run() berjalan bergantian
        //  kalau start()  berjalan bersamaan
    }
}
