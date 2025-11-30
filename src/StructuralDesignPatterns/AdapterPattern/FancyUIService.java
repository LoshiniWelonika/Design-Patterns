package StructuralDesignPatterns.AdapterPattern;

public class FancyUIService {
    public void displayMenu(JsonData jsonData) {
        //Make use of the JsonData to fetch menus
    }

    @Override
    public void displayRecommendations(JsonData jsonData) {
        //Make use of the JsonData to load recommendations
    }
}
