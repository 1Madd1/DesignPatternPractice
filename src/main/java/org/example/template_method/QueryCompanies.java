package org.example.template_method;

public class QueryCompanies extends AbstractQuery {

    @Override
    protected String getQueryString() {
        return "SELECT * FROM COMPANY";
    }
}
