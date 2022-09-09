package com.company.workspaceit.day2;

public class IPhoneInjectorImpl implements phoneInjector{
    @Override
    public Phone getPhone(String name, String os, String processor) {
        return new IPhone(name, os, processor);
    }
}
