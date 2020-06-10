
/**
 * Multi-line comment. A class to measure time elapsed.
 */
import java.util.concurrent.TimeUnit;

public class sample {
    private long startTime;
    private long stopTime;
    public double nanos_per_sec;

    public sample(double nanos_per_sec) {
        this.nanos_per_sec = nanos_per_sec;
    }

    /**
     * start the stop watch.
     */
    public void start() {
        startTime = System.nanoTime();
    }

    /**
     * stop the stop watch.
     */
    public void stop() {
        stopTime = System.nanoTime();
    }

    /**
     * elapsed time in seconds.
     * 
     * @return the time recorded on the stopwatch in seconds
     */
    public double time() {
        return (stopTime - startTime) / this.nanos_per_sec;
    }

    public String toString() {
        return "elapsed time: " + time() + " seconds.";
    }

    /**
     * elapsed time in nanoseconds.
     * 
     * @return the time recorded on the stopwatch in nanoseconds
     */
    public long timeInNanoseconds() {
        return (stopTime - startTime);
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("hello world");
        double NANOS_PER_SEC = 1000000000.0;
        sample my_stopwatch = new sample(NANOS_PER_SEC);
        my_stopwatch.start();
        // pause for a second
        TimeUnit.SECONDS.sleep(1);
        my_stopwatch.stop();

        // single line comment
        boolean debug = true;
        if (debug) {
            for (int i = 0; i < 1; ++i) {
                System.out.println(my_stopwatch.toString());
            }
        }
    }
}
