/**
 * 
 */
package structural.flyweight;

import java.util.HashMap;

import common.Circle;
import common.Shape;
import common.enums.Colours;

/**
 * When requesting a circle, check the hashmap of circles to see if there is
 * already a circle of the required colour and return that, if not create it and
 * add it to the hashmap.
 * 
 * The returned object can then be acted upon further if necessary.
 * 
 * @author kylebennett
 *
 */
public class FlyweightShapeFactory
{
    private static final HashMap<Colours, Shape> circles = new HashMap<Colours, Shape>();

    public Shape getCircle(final Colours colour)
    {
        Circle circle = (Circle) circles.get(colour);

        if (circle == null)
        {
            circle = new Circle(colour);
            circles.put(colour, circle);

            System.out.println("Creating " + colour.toString() + " Circle");
        }

        return circle;
    }
}
