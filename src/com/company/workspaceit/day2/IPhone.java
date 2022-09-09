package com.company.workspaceit.day2;

public class IPhone extends Phone{
    private String version="Pro Max";
    private String color="Star White";

    public IPhone(String name, String os, String processor) {
        super(name, os, processor);
    }


    @Override
    public void printSpecs() {
        super.printSpecs();
        System.out.println("IPone version: "+version
                            +"\nColor variant:"+color);
    }
}
