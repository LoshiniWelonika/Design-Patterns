package CreationalDesignPatterns.AbstractFactory;

import CreationalDesignPatterns.AbstractFactory.com.gpu.Gpu;
import CreationalDesignPatterns.AbstractFactory.com.gpu.MsiGpu;
import CreationalDesignPatterns.AbstractFactory.com.monitor.Monitor;

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
