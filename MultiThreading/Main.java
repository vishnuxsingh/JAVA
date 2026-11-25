public class Main {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();

        thread1.start();
        thread2.start();
    }
}
class MyThread extends Thread {
    @Override 
    public void run() {
        System.out.println("Thread is running: " + Thread.currentThread().getName());
    }
}