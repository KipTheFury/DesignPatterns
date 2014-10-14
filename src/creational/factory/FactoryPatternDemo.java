/**
 * 
 */
package creational.factory;

import common.Shape;

import creational.factory.ShapeFactory.Shapes;

/**
 * Factory pattern is one of most used design pattern in Java. This type of
 * design pattern comes under creational pattern as this pattern provides one of
 * the best ways to create an object.
 * 
 * In Factory pattern, we create object without exposing the creation logic to
 * the client and refer to newly created object using a common interface.
 * 
 * @author kylebennett
 */
public class FactoryPatternDemo
{
    /**
     * @param args
     */
    public static void main(final String[] args)
    {
        final ShapeFactory factory = new ShapeFactory();

        // Get a circle
        final Shape shape1 = factory.getShape(Shapes.Circle);
        shape1.draw();

        // Get a rectangle
        final Shape shape2 = factory.getShape(Shapes.Rectangle);
        shape2.draw();

        // Get a triangle
        final Shape shape3 = factory.getShape(Shapes.Triangle);
        shape3.draw();

    }
}
