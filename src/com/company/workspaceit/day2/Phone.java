package com.company.workspaceit.day2;

public class Phone {
    private String name;
    private String os;
    private String processor;

    public Phone(String name, String os, String processor) {
        this.name = name;
        this.os = os;
        this.processor = processor;
    }


    public void printSpecs(){
        System.out.println("Name: "+name
                            +"\nOS: "+os
                            +"\nProcessor: "+processor);
    }
}
