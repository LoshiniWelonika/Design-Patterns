package CreationalDesignPatterns.PrototypePattern;

public class Bus {
    private int doors;

    @Override
    public Car clone() {
        return new Bus((this));
    }
}
