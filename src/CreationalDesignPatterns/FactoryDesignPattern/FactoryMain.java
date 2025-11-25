package CreationalDesignPatterns.FactoryDesignPattern;

import CreationalDesignPatterns.FactoryDesignPattern.com.phone.OS;
import CreationalDesignPatterns.FactoryDesignPattern.com.phone.OperatingSystemFactory;

public class FactoryMain {
    public static void main(String[] args) {
        OperatingSystemFactory osf = new OperatingSystemFactory();
        OS obj = osf.getInstance("lkjdsd");
        obj.spec();
    }
}
