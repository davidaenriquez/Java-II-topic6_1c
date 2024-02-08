package app;
import java.util.Random;

/**
 * The CounterThread class represents a thread that increments a counter
 * after sleeping for a random amount of time. It extends the Thread class.
 */
public class CounterThread extends Thread {
    /**
     * Runs the thread, sleeps for a random amount of time,
     * increments the counter, and exits the thread.
     */
    public void run() {
        try {
            Random rand = new Random();
            int sleeper = rand.ints(1, (1000 + 1)).findFirst().getAsInt();
            Thread.sleep(sleeper);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Counter.increment();
    }
}