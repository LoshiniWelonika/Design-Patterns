package BridgePattern;

public class ItalianRestaurant extends Restaurant{
    public ItalianRestaurant(Pizza pizza){
        super(pizza);
    }

    @Override
    public void addSauce() {
        pizza.setToppings(null);
    }

    @Override
    public void addToppings() {
        pizza.setSauce("Oil");
    }

    @Override
    public void makeCrust() {
        pizza.setCrust("Thin");
    }
}
