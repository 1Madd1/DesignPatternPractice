package org.example.observer.client;

import org.example.observer.library.Setup;
import org.example.observer.library.Thermometer;

public class PollingThermometerClient {
    private final static long SEC_TO_RUN = 20;
    private final static long MS_BETWEEN_POLLS = 50;
    public static void main(String[] args) {
        Setup s = new Setup();
        Thermometer t = s.getThermometer();
        long count = SEC_TO_RUN * 1000 / MS_BETWEEN_POLLS;
        try {
            for (int i = 0; i < count; i++) {
                Thread.sleep(MS_BETWEEN_POLLS);
                System.out.println(
                        "Checking temperature"
                        + i + ": "
                        + t.getTemperatureCelcius()
                        + ", "
                        + t.getTemperatureKelvin()
                        + ", "
                        + t.getTemperatureFahrenheit()
                );
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        s.shutdown();
    }
}
