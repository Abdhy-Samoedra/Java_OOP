package UAS_Practice;

public class ThreadMain {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            MultiThread thing = new MultiThread();
            thing.start();
        }
    }
}
