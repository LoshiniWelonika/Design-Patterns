package StructuralDesignPatterns.BridgePattern;

@Data
public abstract class Pizza {
    protected String sauce;
    protected String toppings;
    protected String crust;

    public abstract void aseemble();
    public abstract void qualityCheck();
}
