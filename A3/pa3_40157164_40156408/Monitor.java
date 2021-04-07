import java.util.concurrent.locks.Lock;

/**
 * Class Monitor
 * To synchronize dining philosophers.
 *
 * @author Serguei A. Mokhov, mokhov@cs.concordia.ca
 */
public class Monitor
{
	/*
	 * ------------
	 * Data members
	 * ------------
	 */

	enum STATES {eating, thinking, hungry};
	int numberOfChopSticks;
	private int numberOfPhilosophers;
	//private Lock lock;
	public static STATES[] states;
	private static Stick[] sticks;
	private boolean someoneIsTalking;




	/**
	 * Constructor
	 */
	public Monitor(int numberOfPhilosophers)
	{
		// TODO: set appropriate number of chopsticks based on the # of philosophers
		this.numberOfChopSticks = numberOfPhilosophers;
		this.numberOfPhilosophers = numberOfPhilosophers;
		states = new STATES[numberOfPhilosophers];
		sticks = new Stick[numberOfPhilosophers];
		someoneIsTalking = false;

		//Initial states for philosophers and sticks.
		for(int i = 0; i < numberOfPhilosophers; i++) {
			states[i] = STATES.thinking;
			sticks[i] = new Stick();
		}

	}

	/*
	 * -------------------------------
	 * User-defined monitor procedures
	 * -------------------------------
	 */

	/**
	 * Grants request (returns) to eat when both chopsticks/forks are available.
	 * Else forces the philosopher to wait()
	 */
	public synchronized void pickUp(final int piTID)
	{
		states[piTID] = STATES.hungry;
		int lstick = piTID;
		int rstick = (piTID + 1) % numberOfPhilosophers;
		while(!(sticks[lstick].getAvailability() && sticks[rstick].getAvailability())) {
			try {
				wait();
			} catch (InterruptedException e) { }
		}
		sticks[lstick].setAvailability(false);
		sticks[rstick].setAvailability(false);
		states[piTID] = STATES.eating;
		notifyAll();
	}

	/**
	 * When a given philosopher's done eating, they put the chopsticks/forks down
	 * and let others know they are available.
	 */
	public synchronized void putDown(final int piTID)
	{
		states[piTID] = STATES.thinking;
		int lstick = piTID;
		int rstick = (piTID + 1) % numberOfPhilosophers;

		sticks[lstick].setAvailability(true);
		sticks[rstick].setAvailability(true);
		notifyAll();
	}

	/**
	 * Only one philosopher at a time is allowed to philosophy
	 * (while she is not eating).
	 */
	public synchronized void requestTalk()
	{
		while (someoneIsTalking) {
			try {
				wait();
			} catch (InterruptedException e) { }
		}
		someoneIsTalking = true;
		notifyAll();
	}

	/**
	 * When one philosopher is done talking stuff, others
	 * can feel free to start talking.
	 */
	public synchronized void endTalk()
	{
		someoneIsTalking = false;
		notifyAll();
	}
}

// EOF
