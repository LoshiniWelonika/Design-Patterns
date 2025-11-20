package FactoryDesignPattern;

import FactoryDesignPattern.com.phone.Android;
import FactoryDesignPattern.com.phone.OS;

public class FactoryMain {
    public static void main(String[] args) {
        OS obj = new Android();
        obj.spec();
    } 
}
