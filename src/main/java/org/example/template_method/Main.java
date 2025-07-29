package org.example.template_method;


public class Main {
    public static void main(String[] args) {
        Query q = new QueryPeople();
        executeQuery(q);
        q = new QueryCompanies();
        executeQuery(q);
    }

    private static void executeQuery(Query q) {
        Result r = q.execute();
        r.printOutput();
    }
}
