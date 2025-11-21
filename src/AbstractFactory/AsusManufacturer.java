package AbstractFactory;

import AbstractFactory.com.gpu.AsusGpu;
import AbstractFactory.com.gpu.Gpu;
import AbstractFactory.com.monitor.AsusMonitor;
import AbstractFactory.com.monitor.Monitor;

public class AsusManufacturer extends Company {
    @Override
    public Gpu createGpu() {
        return new AsusGpu();
    }

    @Override
    public Monitor createMonitor() {
        return new AsusMonitor();
    }
}
