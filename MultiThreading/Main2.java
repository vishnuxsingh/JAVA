public class Main2 {
    public static void main(String[] args) {
       System.out.println("Main thread started");
         try {
            Thread.sleep(2000); // Sleep for 2 seconds
        } catch (InterruptedException e) {};
        System.out.println("Main thread finished");
    }
}
