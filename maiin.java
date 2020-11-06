package task1.Q1;

public class maiin {
    
    public static void main(String[] args) throws InterruptedException {
        thread r1 = new thread("hello");
        thread r2 = new thread("bye");
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("done");
    }
}