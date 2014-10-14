/**
 * 
 */
package behavioural.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @author kylebennett
 *
 */
public class BinaryObserver implements Observer
{

    @Override
    public void update(final Observable o, final Object state)
    {
        System.out.println("Binary Observer - " + Integer.toBinaryString((Integer) state) + " received from " + o.toString());
    }

}
