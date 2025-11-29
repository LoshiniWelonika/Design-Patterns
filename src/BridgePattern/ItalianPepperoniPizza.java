package BridgePattern;

public class ItalianPepperoniPizza extends Pizza {
    @Override
    public void deliver() {
        System.out.println("Adding Oil Sauce");
        System.out.println("Adding No Toppings");
        System.out.println("Adding Pepperoni");
        System.out.println("Crust is: Thin");
        System.out.println("Order in Progress!");
    }
}

