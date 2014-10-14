/**
 * 
 */
package structural.flyweight;

import common.Circle;
import common.enums.Colours;

/**
 * Flyweight pattern is primarily used to reduce the number of objects created,
 * to decrease memory footprint and increase performance.
 * 
 * This type of design pattern comes under structural pattern as this pattern
 * provides ways to decrease objects count thus improving application required
 * objects structure.
 * 
 * @author kylebennett
 *
 */
public class FlyweightPatternDemo
{

    /**
     * @param args
     */
    public static void main(final String[] args)
    {
        final FlyweightShapeFactory factory = new FlyweightShapeFactory();

        for (int i = 0; i < 20; ++i)
        {
            final Circle circle = (Circle) factory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }
    }

    private static Colours getRandomColor()
    {
        final int random = (int) (Math.random() * (Colours.values().length));
        return Colours.values()[random];
    }

    private static int getRandomX()
    {
        return (int) (Math.random() * 100);
    }

    private static int getRandomY()
    {
        return (int) (Math.random() * 100);
    }
}
