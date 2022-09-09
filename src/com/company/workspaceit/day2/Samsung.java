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

    public static class Main {

        public static void main(String[] args) {
        // write your code here
            PhoneViewer view=new PhoneViewer();
            view.start();
        }
    }
}
