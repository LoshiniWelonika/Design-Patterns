package BridgePattern;

public class ItalianVeggiePizza extends Pizza {
    @Override
    public void deliver() {
        System.out.println("Adding Oil Sauce");
        System.out.println("Adding No Toppings");
        System.out.println("Adding Cheese");
        System.out.println("Crust is: Thin");
        System.out.println("Order in Progress!");
    }
}

