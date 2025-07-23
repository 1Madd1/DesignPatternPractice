package org.example.creational_designs.factory;

public interface Shape {
    void draw();
    public static Shape create(String s) {
        Shape retValue = null;
        if (s.startsWith("#rect")) {
            retValue = new Rectangle();
        } else if (s.startsWith("#oval")) {
            retValue = new Oval();
        } else if (s.startsWith("#line")) {
            retValue = new Line();
        }
        return retValue;
    }
}
