package StructuralDesignPatterns.BridgePattern;

public class AmericanRestaurant extends Restaurant{
    public AmericanRestaurant(Pizza pizza){
        super(pizza);
    }

    @Override
    public void addSauce() {
        pizza.setToppings("Everything");
    }

    @Override
    public void addToppings() {
        pizza.setSauce("Super Secret Recipe");
    }

    @Override
    public void makeCrust() {
        pizza.setCrust("Thick");
    }
}
