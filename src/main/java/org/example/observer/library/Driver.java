package org.example.observer.library;

public class Driver extends Thread {
    public static final long AVERAGE_TIME_BETWEEN_UPDATES_IN_SEC = 5;
    private static final long RANGE_OF_CHANGE = 100;
    public int updateCount = 0;
    private long value = 3000; // Initial value just to make it work
    private Thermometer thermometer;
    private boolean shutdown = false;
    public Driver(Thermometer thermometer) {
        this.thermometer = thermometer;
    }

    @Override
    public void run() {
        try {
            while (!this.shutdown) {
                this.value += (long) (Math.random() * RANGE_OF_CHANGE) - (RANGE_OF_CHANGE / 2);
                this.updateCount++;
                System.out.println(
                        "Driver update #"
                        + this.updateCount
                        + ": "
                        + this.value
                );
                this.thermometer.driverValue(this.value);
                Thread.sleep((long) (Math.random() * AVERAGE_TIME_BETWEEN_UPDATES_IN_SEC * 1000));
            }
        } catch (Exception e) {

        }
    }

    public void shutdown() {
        this.shutdown = true;
    }
}
