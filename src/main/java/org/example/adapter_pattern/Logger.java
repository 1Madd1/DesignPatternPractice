package org.example.adapter_pattern;

public abstract class Logger {

    abstract public void trace(String message);
    abstract public void debug(String message);
    abstract public void log(String message);

    public static Logger create() {
        return new LoggerImpl();
    }

}
