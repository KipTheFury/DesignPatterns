/**
 * 
 */
package behavioural.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 * @author kylebennett
 *
 */
public class Subject extends Observable
{
    private final List<Observer> observers = new ArrayList<Observer>();

    private int state = 0;
    private final int id;

    public Subject(final int id)
    {
        this.id = id;
    }

    @Override
    public synchronized void addObserver(final Observer o)
    {
        observers.add(o);
    }

    @Override
    public synchronized void deleteObserver(final Observer o)
    {
        observers.remove(o);
    }

    @Override
    public void notifyObservers()
    {
        for (final Observer o : observers)
        {
            o.update(this, state);
        }
    }

    public int getState()
    {
        return state;
    }

    public void setState(final int state)
    {
        this.state = state;
        notifyObservers();
    }

    @Override
    public String toString()
    {
        return "Subject " + id;
    }
}
