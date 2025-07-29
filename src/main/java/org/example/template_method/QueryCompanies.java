package org.example.template_method;

public class QueryCompanies implements Query {
    @Override
    public Result execute() {
        Connection c = new Connection();
        Result r = c.execute("SELECT * FROM COMPANY");
        c.close();
        return r;
    }
}
