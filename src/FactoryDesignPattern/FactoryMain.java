package FactoryDesignPattern;

import FactoryDesignPattern.com.phone.Android;
import FactoryDesignPattern.com.phone.OS;
import FactoryDesignPattern.com.phone.OperatingSystemFactory;

public class FactoryMain {
    public static void main(String[] args) {
        OperatingSystemFactory osf = new OperatingSystemFactory();
        OS obj = osf.getInstance("lkjdsd");
        obj.spec();
    }
}
