import common.BaseThread;

/**
 * Class Philosopher.
 * Outlines main subroutines of our virtual philosopher.
 *
 * @author Serguei A. Mokhov, mokhov@cs.concordia.ca
 */
public class Philosopher extends BaseThread
{
	/**
	 * Max time an action can take (in milliseconds)
	 */
	public static final long TIME_TO_WASTE = 1000;


	/**
	 * Create a new Philosopher instance with an ID.
	 * @param tid
	 */
	public Philosopher(int tid) {
		super(tid);
	}

	/**
	 * The act of eating.
	 * - Print the fact that a given phil (their TID) has started eating.
	 * - yield
	 * - Then sleep() for a random interval.
	 * - yield
	 * - The print that they are done eating.
	 */
	public void eat()
	{
		try
		{
			System.out.println("\n Philosopher " + this.iTID + " has started eating.");
			Thread.yield();
			sleep((long)(Math.random() * TIME_TO_WASTE));
			Thread.yield();
			System.out.println("\n Philosopher " + this.iTID + " is done eating.");
		}
		catch(InterruptedException e)
		{
			System.err.println("Philosopher.eat():");
			DiningPhilosophers.reportException(e);
			System.exit(1);
		}
	}

	/**
	 * The act of thinking.
	 * - Print the fact that a given phil (their TID) has started thinking.
	 * - yield
	 * - Then sleep() for a random interval.
	 * - yield
	 * - The print that they are done thinking.
	 */
	public void think()
	{
		try {

			System.out.println("\n Philosopher number " + this.iTID + " is now thinking.");
			Thread.yield();
			sleep((long)(Math.random() * TIME_TO_WASTE));
			Thread.yield();
			System.out.println("\n Philosopher number " + this.iTID + " is done thinking.");

		} catch (InterruptedException e) {
			System.err.println("Philosopher.think():");
			DiningPhilosophers.reportException(e);
			System.exit(1);
		}
	}

	/**
	 * The act of talking.
	 * - Print the fact that a given phil (their TID) has started talking.
	 * - yield
	 * - Say something brilliant at random
	 * - yield
	 * - The print that they are done talking.
	 */
	public void talk()
	{
		try {

			System.out.println("\n Philosopher number " + this.iTID + " is now talking.");
			Thread.yield();
			saySomething();
			sleep((long)(Math.random() * TIME_TO_WASTE));
			Thread.yield();
			System.out.println("\n Philosopher number " + this.iTID + " is done talking.");

		} catch (InterruptedException e) {
			System.err.println("Philosopher.think():");
			DiningPhilosophers.reportException(e);
			System.exit(1);
		}


	}

	/**
	 * Overridden Thread.run().
	 */
	public void run()
	{
		for(int i = 0; i < DiningPhilosophers.DINING_STEPS; i++)
		{
			DiningPhilosophers.soMonitor.pickUp(getTID());

			eat();

			DiningPhilosophers.soMonitor.putDown(getTID());

			think();

			/*
			 * TODO:
			 * A decision is made at random whether this particular
			 * philosopher is about to say something terribly useful.
			 */
			double ranNum = Math.random(); // Random number between 0 and 1 to determine if philosopher will talk

			// If philosopher is not eating and if the previously generated random number is
			// less than 0.5, philosopher will talk.
			if(Monitor.states[getTID()] != Monitor.STATES.eating && ranNum > 0.5)
			{
				DiningPhilosophers.soMonitor.requestTalk();
				talk();
				DiningPhilosophers.soMonitor.endTalk();
			}
			Thread.yield();
		}
	}

	/**
	 * Prints out a phrase from the array of phrases at random.
	 * Feel free to add your own phrases.
	 */
	public void saySomething()
	{
		String[] astrPhrases =
		{
			"Eh, it's not easy to be a philosopher: eat, think, talk, eat...",
			"You know, true is false and false is true if you think of it",
			"2 + 2 = 5 for extremely large values of 2...",
			"If thee cannot speak, thee must be silent",
			"My number is " + getTID() + ""
		};

		System.out.println
		(
			"\n Philosopher " + getTID() + " says: " +
			astrPhrases[(int)(Math.random() * astrPhrases.length)]
		);
	}
}

// EOF
