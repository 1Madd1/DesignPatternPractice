package org.example.observer.client;

import org.example.observer.library.Observable;
import org.example.observer.library.Observer;
import org.example.observer.library.Setup;
import org.example.observer.library.Thermometer;

public class ObserverThermometerClient implements Observer {

    public ObserverThermometerClient() {
    }

    public static void main(String[] args) {
        Setup s = new Setup();
        ObserverThermometerClient client = new ObserverThermometerClient();
        s.getThermometer().addObserver(client);
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        s.shutdown();
    }

    @Override
    public void update(Observable o) {
        Thermometer t = (Thermometer) o;
        System.out.println(
                "Checking temperature: "
                        + t.getTemperatureCelcius()
                        + ", "
                        + t.getTemperatureKelvin()
                        + ", "
                        + t.getTemperatureFahrenheit()
        );
    }
}
