/**
 * 
 */
package behavioural.observer;

import java.util.Random;

/**
 * Observer pattern is used when there is one to many relationship between
 * objects such as if one object is modified, its depenedent objects are to be
 * notified automatically. Observer pattern falls under behavioral pattern
 * category.
 * 
 * Observer pattern uses three actor classes. Subject, Observer and Client.
 * Subject, an object having methods to attach and de-attach observers to a
 * client object.
 * 
 * @author kylebennett
 *
 */
public class ObserverPatternDemo
{
    static final Random random = new Random();

    /**
     * @param args
     * @throws InterruptedException
     */
    public static void main(final String[] args) throws InterruptedException
    {
        startDemo();
    }

    private static void startDemo() throws InterruptedException
    {
        final Subject sub1 = new Subject(1);
        final Subject sub2 = new Subject(2);

        final BinaryObserver bin = new BinaryObserver();

        sub1.addObserver(bin);
        sub2.addObserver(bin);

        System.out.println("Starting...");

        Thread.sleep(2000);

        final RandomStateChange rsc1 = new RandomStateChange(sub1);
        final RandomStateChange rsc2 = new RandomStateChange(sub2);

        final Thread t1 = new Thread(rsc1);
        final Thread t2 = new Thread(rsc2);

        t1.start();
        t2.start();

    }
}
