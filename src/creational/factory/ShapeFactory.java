/**
 * 
 */
package creational.factory;

import common.Circle;
import common.Rectangle;
import common.Shape;
import common.Triangle;
import common.enums.Colours;

/**
 * @author kylebennett
 *
 */
public class ShapeFactory
{

    public enum Shapes
    {
        Circle, Rectangle, Triangle;
    }

    /**
     * Pass a type of shape into the getShape() method to return an instance of
     * the shape.
     * 
     * @param shape
     *            - Type of shape requested.
     * @return The shape.
     */
    public Shape getShape(final Shapes shape)
    {
        switch (shape)
        {
            case Circle:
                return new Circle(Colours.Blue);

            case Rectangle:
                return new Rectangle();

            case Triangle:
                return new Triangle();

            default:
                throw new IllegalArgumentException("Invalid Shape");
        }
    }
}
