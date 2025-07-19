package org.example.adapter_pattern;

public class LoggerImpl extends Logger {
    @Override
    public void trace(String message) {
        System.out.println("[TRACE] " + message);
    }

    @Override
    public void debug(String message) {
        System.out.println("[DEBUG] " + message);
    }

    @Override
    public void log(String message) {
        System.out.println("[LOG] " + message);
    }
}
