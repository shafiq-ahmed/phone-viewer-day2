package com.company.workspaceit.day2;

public class Samsung extends Phone{
    private String type="Foldable";
    private String series="Note";

    public Samsung(String name, String os, String processor) {
        super(name, os, processor);
    }


    @Override
    public void printSpecs() {
        super.printSpecs();
        System.out.println("Phone type: "+type
                            +"\nSeries :"+series);
    }
}
