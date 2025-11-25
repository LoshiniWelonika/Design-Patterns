package CreationalDesignPatterns.phone;

//Builder Class → Contains setter-like methods
public class PhoneBuilder {
    private String os;
    private int ram;
    private String processor;
    private double screenSize;
    private int battery;

    public PhoneBuilder setOs(String os) {
        this.os = os;
        return this; //Method Chaining → Each setter returns builder object
    }

    public PhoneBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public PhoneBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public PhoneBuilder setScreenSize(double screenSize) {
        this.screenSize = screenSize;
        return this;
    }

    public PhoneBuilder setBattery(int battery) {
        this.battery = battery;
        return this;
    }

    public Phone build(){  //build() Method → Returns the final product
        return new Phone(os, ram, processor, screenSize, battery);
    }
}
