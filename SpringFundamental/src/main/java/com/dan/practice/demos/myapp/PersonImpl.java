package com.dan.practice.demos.myapp;

public class PersonImpl implements Person{
    public void greet() {
        System.out.println("Hello, there");
    }

    public void greetInFrench() {
        System.out.println("Comment, Ça Va");
    }

    @Override
    public void greetInSpanish() {
        System.out.println("Hola!");
    }
}
