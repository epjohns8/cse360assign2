/* Evan Johnson
 * #1213632821
 * CSE 360
 * Description: this is the adding machine, whenever an add or subtract method is called:
 * myString is updated along with the running total
 */
package cse360assign2;

// initialize myString to "0" so that when "toString()" is called, it starts with the correct number.
public class AddingMachine {

	private int total;
	private String myString = "0";
	
	
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
	}
	
	// return the current total as an integer
	public int getTotal () {
		return total;
	}
	
	// add the value to the total and add this process to the string
	public void add (int value) {
		myString = myString + " + " + value;
		total = total + value;
	}
	
	// subtract the value from the total and add this process to the string
	public void subtract (int value) {
		myString = myString + " - " + value;
		total = total - value;
	}
		
	// return the current string
	public String toString () {	
		return myString;
	}

	// reset the total and string back to 0;
	public void clear() {
		total = 0;
		myString = "0";
	}
}
