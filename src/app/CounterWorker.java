package app;

/**
 * The CounterWorker class represents the main class for the counter application.
 * It creates multiple CounterThread instances, starts their threads, and waits
 * for all threads to finish before printing the final counter value.
 */
public class CounterWorker {

    /**
     * The main method of the application.
     *
     * @param args Command-line arguments (not used in this application).
     * @throws InterruptedException If an interrupt exception occurs.
     */
    public static void main(String[] args) throws InterruptedException {
        // Print start message
        System.out.println("This is the initial value of the Counter " + Counter.getCount());

        // Number of Counters to create
        int numberCounters = 1000;

        // Create 1000 Counters that can each run in their own thread
        CounterThread[] counters = new CounterThread[numberCounters];
        for (int x = 0; x < 1000; ++x)
            counters[x] = new CounterThread();

        // Start all 1000 Counter threads
        for (int x = 0; x < 1000; ++x)
            counters[x].start();

        // Wait for 1000 Counter threads to finish
        for (int x = 0; x < 1000; ++x)
            counters[x].join();

        // What value did the Counter end with?
        System.out.println("This is the end value of the Counter " + Counter.getCount());
    }

}