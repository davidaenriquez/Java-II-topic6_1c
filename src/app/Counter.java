package app;

/**
 * The Counter class represents a simple counter with thread-safe incrementing functionality.
 * It provides a static counter that starts at zero, and the increment method ensures
 * thread-safe access to modify the counter value. The class also includes a method to
 * retrieve the current counter value.
 */
public class Counter {
    // Static counter that starts at zero
    private static int count = 0;

    /**
     * Increments the counter in a thread-safe manner.
     * This method uses synchronization to ensure that
     * multiple threads can safely modify the counter value.
     */
    static synchronized void increment() {
        count = count + 1;
    }

    /**
     * Retrieves the current value of the counter.
     *
     * @return The current value of the counter.
     */
    static int getCount() {
        return count;
    }
}