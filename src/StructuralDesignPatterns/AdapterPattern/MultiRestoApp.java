package StructuralDesignPatterns.AdapterPattern;

public class MultiRestoApp implements IMultiRestoShop {
    @Override
    public void displayMenu(XmlData xmlData) {
        //Displays menus using XML data
    }

    @Override
    public void displayRecommendations(XmlData xmlData) {
        //Displays recommendations using XML data
    }
}
