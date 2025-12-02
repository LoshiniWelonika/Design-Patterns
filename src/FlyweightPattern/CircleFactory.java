import FlyweightPattern.Circle;
import FlyweightPattern.ConcreteCircle;
import java.util.HashMap;
import java.util.Map;

package FlyweightPattern;

public class CircleFactory { 
    private static final Map<String, Circle> circleMap = new HashMap<>();

    public static Circle getCircle(String color){
        Circle circle = circleMap.get(color);

        if (circle == null){
            circle = new ConcreteCircle(color);
            circleMap.put(color, circle);
            System.out.println("Creating a " +color+ " circle");
        }

        return circle;
    }
}
