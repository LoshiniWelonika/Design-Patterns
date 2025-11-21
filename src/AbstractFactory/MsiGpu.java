package AbstractFactory;

public class MsiGpu implements Gpu {
    @Override
    public void assemble() {
        System.out.println("MSI GPU");
    }
}
