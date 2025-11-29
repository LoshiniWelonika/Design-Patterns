package BridgePattern;

public class AmericanVeggiePizza extends Pizza {
    @Override
    public void deliver() {
        System.out.println("Adding Super Secret Sauce");
        System.out.println("Adding Toppings: Everything");
        System.out.println("Adding Cheese");
        System.out.println("Crust is: Thick");
        System.out.println("Order in Progress!");
    }
}

