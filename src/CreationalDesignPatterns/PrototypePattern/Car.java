package CreationalDesignPatterns.PrototypePattern;

public class Car extends Vehicle{

    private int topSpeed;

    public Car() {}

    public Car(Car car) {
        super(car);
        this.topSpeed = topSpeed;
    }

    @Override
    public Car clone() {
        return new Car((this));
    }
}
