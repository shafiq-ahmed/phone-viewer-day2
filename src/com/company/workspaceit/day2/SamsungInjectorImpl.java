package com.company.workspaceit.day2;

public class SamsungInjectorImpl implements phoneInjector{
    @Override
    public Phone getPhone(String name, String os, String processor) {
        return new Samsung(name, os, processor);
    }
}
