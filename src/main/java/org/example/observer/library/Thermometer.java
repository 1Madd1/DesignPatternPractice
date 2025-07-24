package org.example.observer.library;

public class Thermometer {
    public double temperatureInKelvin = -1.0;
    private final String KELVIN_FORMAT = "%,.1fK";
    private final String CELCIUS_FORMAT = "%,.1fC";
    private final String FAHRENHEIT_FORMAT = "%,.1fF";

    public Thermometer() {
    }

    void driverValue(long value) {
        this.temperatureInKelvin = value/100.0;
    }

    public String getTemperatureKelvin() {
        return String.format(KELVIN_FORMAT, this.temperatureInKelvin);
    }
    public String getTemperatureCelcius() {
        return String.format(CELCIUS_FORMAT, this.temperatureInKelvin - 273.15);
    }
    public String getTemperatureFahrenheit() {
        return String.format(FAHRENHEIT_FORMAT, this.temperatureInKelvin - 273.15);
    }
}
