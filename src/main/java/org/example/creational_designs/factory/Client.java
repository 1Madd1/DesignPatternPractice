package org.example.creational_designs.factory;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private List<Shape> shapes;
    public Client() {
        this.shapes = new ArrayList<Shape>();
    }

    public void readShapes(String[] shapesAsText) {
        for (String shape : shapesAsText) {
            this.shapes.add(Shape.create(shape));
        }
    }

    public void drawAllShapes() {
        for (Shape shape : this.shapes) {
            shape.draw();
        }
    }
}
