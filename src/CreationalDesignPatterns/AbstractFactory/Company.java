//This is the abstract factory class

package CreationalDesignPatterns.AbstractFactory;

import CreationalDesignPatterns.AbstractFactory.com.gpu.Gpu;
import CreationalDesignPatterns.AbstractFactory.com.monitor.Monitor;

public abstract class Company {
    public Gpu assembleGpu(){
        Gpu gpu = createGpu();
        gpu.assemble();
        return gpu;
    }

    public abstract Gpu createGpu();

    public abstract Monitor createMonitor();
}
