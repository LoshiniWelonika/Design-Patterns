//This is the abstract factory class

package AbstractFactory;

import AbstractFactory.com.gpu.Gpu;
import AbstractFactory.com.monitor.Monitor;

public abstract class Company {
    public Gpu assembleGpu(){
        Gpu gpu = createGpu();
        gpu.assemble();
        return gpu;
    }

    public abstract Gpu createGpu();

    public abstract Monitor createMonitor();
}
