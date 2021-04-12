import java.util.PriorityQueue;
import java.util.Queue;
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

	enum STATES {eating, thinking, hungry}; //Set of all possible states
	int numberOfChopSticks;
	private int numberOfPhilosophers;
	private int[] eatingCount; 		//Number of times philosophers have eaten
	public static STATES[] states;  //Current state of all philosophers
	private static Stick[] sticks;  //Array of sticks as ordered on the table
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
		eatingCount = new int[numberOfPhilosophers];
		someoneIsTalking = false;

		//Initial states for philosophers and sticks.
		for(int i = 0; i < numberOfPhilosophers; i++) {
			states[i] = STATES.thinking; //Initialized to thinking
			sticks[i] = new Stick(); //Initialized to true (available)
			eatingCount[i] = 0;
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
		states[piTID] = STATES.hungry; //Set philosopher state to hungry

		//Index of chopsticks surrounding a given philosopher
		int leftStick = piTID;
		int rightStick = (piTID + 1) % numberOfPhilosophers;

		//If both chopsticks are not available or neighbour philosophers are starving.
		while(!(sticks[leftStick].getAvailability() && sticks[rightStick].getAvailability()) || checkStarvation(piTID)) {
			try {
				wait();
			} catch (InterruptedException e) { }
		}
		sticks[leftStick].setAvailability(false);
		sticks[rightStick].setAvailability(false);
		states[piTID] = STATES.eating;
		eatingCount[piTID]++;
		notifyAll();
	}

	/**
	 * Verifies if the calling philosophers has eaten more times than his neighbours. If so,
	 * current philosopher cannot compete for the sticks.
	 */
	private boolean checkStarvation(int piTID) {
		int eatingCountLeft = eatingCount[(piTID - 1 + numberOfPhilosophers) % numberOfPhilosophers];
		int eatingCountRight = eatingCount[(piTID + 1) % numberOfPhilosophers];
		int currentEatingCount = eatingCount[piTID];

		//Returns true if current philo has eaten more than his right or left neighbours
		return eatingCountLeft < currentEatingCount || eatingCountRight < currentEatingCount;
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
