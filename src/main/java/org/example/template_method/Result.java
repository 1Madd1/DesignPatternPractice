package org.example.template_method;

public class Result {

    private String queryResult;

    public Result() {
    }

    public Result(String queryResult) {
        this.queryResult = queryResult;
    }

    public void printOutput() {
        System.out.println(queryResult);
    }
}
