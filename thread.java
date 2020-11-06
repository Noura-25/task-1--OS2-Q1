package task1.Q1;



    import java.util.Date;

public class thread implements Runnable {
    // private int count = 0;
    private String greeting;

    public thread(String greeting) {
        this.greeting = greeting;
    }

    @Override
    public void run() {
        Date now = new Date();
        for (int i = 0; i < 5; i++) {

            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {

            }
            System.out.println(now + "-" + greeting);
        }
    }

}
