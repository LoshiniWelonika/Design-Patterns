package AdapterPattern;

public class AdapterMain {
    public static void main(String[] args) {
        IMultiRestoShop multiRestoShop = new MultiRestoApp();
        multiRestoShop.displayMenu(new XmlData());

        FancyUIServiceAdapter adapter = new FancyUIServiceAdapter();
        adapter.displayMenu(new XmlData());
    }
}
