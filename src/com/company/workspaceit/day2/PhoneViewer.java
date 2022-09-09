package com.company.workspaceit.day2;

import java.util.Scanner;

public class PhoneViewer {
    private Phone phone=null;
    public void start(){

        System.out.println("Select Phone: 1.Samsung  2.IPhone");
        Scanner scanner= new Scanner(System.in);
        String userChoice=scanner.next();
        if(userChoice.equals("1")){
            SamsungInjectorImpl samsung= new SamsungInjectorImpl();
            phone=samsung.getPhone("Samsung","Android","Octa-core");

        }else if (userChoice.equals("2")){
            IPhoneInjectorImpl iPhone=new IPhoneInjectorImpl();
            phone= iPhone.getPhone("Iphone","IOS","Apple M1");

        }
        if(phone!=null) {
            phone.printSpecs();
        }
    }
}
