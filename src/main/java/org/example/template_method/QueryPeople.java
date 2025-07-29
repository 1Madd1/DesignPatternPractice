package org.example.template_method;

public class QueryPeople extends AbstractQuery {

    @Override
    protected String getQueryString() {
        return "SELECT * FROM PEOPLE";
    }
}
