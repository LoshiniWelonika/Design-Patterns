package AbstractFactory.com.gpu;

import AbstractFactory.com.gpu.Gpu;

public class MsiGpu implements Gpu {
    @Override
    public void assemble() {
        System.out.println("MSI GPU");
    }
}
