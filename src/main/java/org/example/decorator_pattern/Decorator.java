package org.example.decorator_pattern;

public abstract class Decorator implements GraphicalComponent{

    private GraphicalComponent next;

    public Decorator(GraphicalComponent next) {
        this.next = next;
    }

    @Override
    public void paint() {
        this.next.paint();
    }

    @Override
    public GraphicalComponent addContent(Object content) {
        return this;
    }
}
