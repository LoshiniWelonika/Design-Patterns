package AdapterPattern;

public class FancyUIServiceAdapter implements IMultiRestoShop{
    private final FancyUIService fancyUIService;

    public FancyUIServiceAdapter()
    {

    }
    @Override
    public void displayMenu(XmlData xmlData) {
        JsonData jsonData = convertXmlToJson(xmlData);
        fancyUIService.displayMenu(jsonData);
    }

    @Override
    public void displayRecommendations(XmlData xmlData) {
        JsonData jsonData = convertXmlToJson(xmlData);
        fancyUIService.displayRecommendations(jsonData);
    }

    private JsonData convertXmlToJson(XmlData xmlData){
        //Convert XmlData to JsonData and return it
    }
}
