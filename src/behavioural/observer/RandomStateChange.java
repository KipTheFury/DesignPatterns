package behavioural.observer;

import java.util.Random;

class RandomStateChange implements Runnable
{
    private final Random random = new Random();

    private final Subject subject;

    public RandomStateChange(final Subject s)
    {
        this.subject = s;
    }

    @Override
    public void run()
    {
        for (int i = 0; i < 20; i++)
        {
            subject.setState(random.nextInt(100));
            try
            {
                Thread.sleep((random.nextInt(3) * 1000) + 500);
            }
            catch (final InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}