package org.example.proxy_pattern;

public class BusinessObjectProxy extends BusinessObject {

    private BusinessObject target;

    public BusinessObjectProxy(BusinessObject target) {
        this.target = target;
    }

    @Override
    public void sayHi() {
        System.out.println("Before call..");
        this.target.sayHi();
        System.out.println("After call..");
    }
}
