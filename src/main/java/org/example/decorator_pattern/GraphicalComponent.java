package org.example.decorator_pattern;

public interface GraphicalComponent {
    public void paint();
    public GraphicalComponent addContent(Object content);
}
