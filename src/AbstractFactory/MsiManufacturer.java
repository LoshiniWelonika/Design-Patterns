package AbstractFactory;

import AbstractFactory.com.gpu.Gpu;
import AbstractFactory.com.gpu.MsiGpu;
import AbstractFactory.com.monitor.AsusMonitor;
import AbstractFactory.com.monitor.Monitor;

public class MsiManufacturer extends Company {
    @Override
    public Gpu createGpu() {
        return new MsiGpu();
    }

    @Override
    public Monitor createMonitor() {
        return new MsiMonitor();
    }
}
