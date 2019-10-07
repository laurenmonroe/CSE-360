/**
 * Name: Lauren Monroe
 * Class: CSE 360 Monday 9:40
 * ID: 1215051617
 * Assignment: #2
 * Description: This file is the AddingMachine class
*/

package cse360assign2;

/**
 * The AddingMachine class creates a AddingMachine object which has an
 * integer instance variable which is the total and a String
 * instance variable which is the history. The class also contains methods
 * to add and subtract, as well as return the total
*/
public class AddingMachine {

	private int total;
	String history;

	/**
		 * Constructor.
		*/
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
		history = "0";
	}

	/**
		 * Returns an int that is the total
		 *
		 * @return int total
		*/
	public int getTotal () {
		return total;
	}

	/**
		 * Adds a number to the total and update the history
		 *
		 * @param int value to be added to the total
		*/
	public void add (int value) {
		total = total + value;
		history += " + " + value;
	}

	/**
		 * Subtracts a number from the total and update the history
		 *
		 * @param value to be subtracted
		*/
	public void subtract (int value) {
		total = total -  value;

		history += " - " + value;
	}

	/**
		 * Returns an String representation of the total
		 *
		 * @return String formats the answer and returns it as a String
		*/
	public String toString () {
		return history;
	}

	/**
		 * Clears the total
		 *
		*/
	public void clear() {
		total = 0;
		history = "0";
	}
}
