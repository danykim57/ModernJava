package com.dan.practice.demos.myapp;

public class Proxy implements Person{
    private Person delegate;

    public Proxy(Person delegate) {
        this.delegate = delegate;
    }

    public void greet() {
        delegate.greet();
    }
}
