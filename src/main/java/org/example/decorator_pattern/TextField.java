package org.example.decorator_pattern;

import java.util.LinkedList;
import java.util.List;

public class TextField implements GraphicalComponent{

    private List<String> lines = new LinkedList<String>();

    @Override
    public void paint() {
        System.out.println("Start TextField....");
        for (String line : this.lines) {
            System.out.println(line);
        }
        System.out.println("End TextField....");
    }

    @Override
    public GraphicalComponent addContent(Object content) {
        assert(content instanceof String);
        this.lines.add((String) content);
        if (this.lines.size() == 3) {
            return new ScrollBarDecorator(this);
        }
        return this;
    }
}
