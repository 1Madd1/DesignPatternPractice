package org.example.template_method;

public class QueryPeople implements Query {
    @Override
    public Result execute() {
        Connection c = new Connection();
        Result r = c.execute("SELECT * FROM PEOPLE");
        c.close();
        return r;
    }
}
