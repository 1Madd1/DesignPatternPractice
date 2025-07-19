package org.example.proxy_pattern;

abstract public class BusinessObject {
    public abstract void sayHi();
    public static BusinessObject create() {
        return new BusinessObjectProxy(new BusinessObjectImpl());
    }
}
