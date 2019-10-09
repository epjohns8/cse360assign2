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
	
	public int getTotal () {
		return total;
	}
	
	public void add (int value) {
		myString = myString + " + " + value;
		total = total + value;
	}
	
	public void subtract (int value) {
		myString = myString + " - " + value;
		total = total - value;
	}
		
	public String toString () {	
		return myString;
	}

	public void clear() {
		total = 0;
		myString = "0";
	}
}
