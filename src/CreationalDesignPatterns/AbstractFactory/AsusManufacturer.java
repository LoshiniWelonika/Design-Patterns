package CreationalDesignPatterns.AbstractFactory;

import CreationalDesignPatterns.AbstractFactory.com.gpu.AsusGpu;
import CreationalDesignPatterns.AbstractFactory.com.gpu.Gpu;
import CreationalDesignPatterns.AbstractFactory.com.monitor.AsusMonitor;
import CreationalDesignPatterns.AbstractFactory.com.monitor.Monitor;

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
