/**
 * 
 */
package common;

import common.enums.Colours;

/**
 * @author kylebennett
 *
 */
public class Circle implements Shape
{
    private final Colours colour;
    private int x;
    private int y;
    private int radius;

    public Circle(final Colours colour)
    {
        this.colour = colour;
    }

    public void setX(final int x)
    {
        this.x = x;
    }

    public void setY(final int y)
    {
        this.y = y;
    }

    public void setRadius(final int radius)
    {
        this.radius = radius;
    }

    @Override
    public void draw()
    {
        System.out.println("Circle: Draw() [Color : " + colour + ", x : " + x + ", y :" + y + ", radius :" + radius);
    }

}
