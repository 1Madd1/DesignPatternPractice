package org.example.template_method;

public abstract class AbstractQuery implements Query {

    @Override
    public Result execute() {
        Connection c = new Connection();
        Result r = c.execute(this.getQueryString());
        c.close();
        return r;
    }

    abstract protected String getQueryString();
}
