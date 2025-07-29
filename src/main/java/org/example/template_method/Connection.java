package org.example.template_method;

public class Connection {
    public Result execute(String query) {
        Result r = null;
        if (query.contains("PEOPLE")) {
            r = new Result("Jacob, Mary, George");
        } else if (query.contains("COMPANY")) {
            r = new Result("NVIDIA, JYSK, IDEA, AMD");
        }
        return r;
    }

    public void close() {

    }
}
