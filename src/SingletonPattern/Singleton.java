package SingletonPattern;

public class Singleton {

    private static Singleton instance;

    // private constructor → no external object creation
    private Singleton() { }

    // global access point
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
