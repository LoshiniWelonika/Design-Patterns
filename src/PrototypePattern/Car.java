package PrototypePattern;

public class Car implements Prototype{
    private String brand;
    private String model;
    private String color;
    private String topSpeed;

    public Car() {}

    public Car(Car car) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.topSpeed = topSpeed;
    }

    @Override
    public Car clone() {
        return new Car((this));
    }
}
