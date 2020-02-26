package cse360assign2;

/**
 * Represents a simple List object, containing a maximum of 10 values
 * @author Jayanth Rao
 * @ClassID 370
 * @Assignment Assignment #2
 *
 */

class SimpleList {
	
	/**
	 * Declaration of a list object
	 */
	private int list[];
	
	/**
	 * Declaration of the count of the values in the list
	 */
	private int count;
	
	/**
	 * Stores the maximum length of the list
	 */
	final int LISTLENGTH = 10;
	
	/**
	 * Creates a new SimpleList with a length of 10 and the count
	 * initialized to 0 values.
	 */
	public SimpleList() {
		list = new int[LISTLENGTH];
		count = 0;
	}
	
	/**
	 * Adds the specified value to the beginning of the list, and shifts all 
	 * other values to the right. 
	 * Updates the count of values currently in the list.
	 * 
	 * @param value This is the value to be added to the list; int
	 */
	public void add(int value) {
		// Create a temporary array to copy elements from list
		int tempArr[] = new int[list.length + 1];
		
		for (int iter = 1; iter < list.length; iter++) {
			tempArr[iter] = list[iter - 1];
		}
		tempArr[0] = value;
		list = tempArr;
		
		// check if the length of list is > 10; if so, remove the last index.
		if (list.length > 10) {
			int[] shortList = new int[LISTLENGTH];
			System.arraycopy(list, 0, shortList, 0, 10);
			list = shortList;
		}
		// increment count to accomodate for a new value inserted into the list.
		count++;
	}
	
	/**
	 * Removes the specified value from the list. Also updates the count
	 * of values in the list.
	 * @param value The value to be removed; int
	 */ 
	public void remove(int value) {
		// a temporary array
		int tempArr[] = new int[list.length];
		
		// boolean to store whether the value exists in the list or not.
		boolean exists = false;
		// stores the index at which the element is found.
		int index = 0;
		
		for (int iter = 0; iter < list.length; iter++) {
			if (list[iter] == value && exists == false) {
				index = iter;
				exists = true;
			}
		}
		
		// copy from list[0] to list[index]
		System.arraycopy(list, 0, tempArr, 0, index);
		// copy from list[index + 1] to second to last element
		System.arraycopy(list, index + 1, tempArr, index, 10 - index - 1);
		list = tempArr;
		
		// decrement count to accomodate for removing the element from the list
		count--;
	}
	
	/**
	 * Returns the count of values currently in the list
	 * @return int count
	 */
	public int count() {
		return count;
	}
	
	/**
	 * A custom toString method which prints the list with a space delimiter
	 * @return String The list delimited by spaces.
	 */
	public String toString() {
		// String to hold the assembled list string
		String arrString = "";
	
		for (int iter = 0; iter < list.length; iter++) {
			arrString += list[iter];
			arrString += " ";
		}
		// trim the trailing whitespace
		arrString = arrString.trim();
		return arrString;
	}
	
	/**
	 * Searches for the specified value in the list. If it exists, its index is returned. 
	 * Otherwise, -1 is returned to note that the value does not exist in the list.
	 * @param value The value to be searched for; int
	 * @return int The index of the value to be searched for 
	 */
	public int search(int value) {
		// boolean to flag whether the value was found or not
		boolean found = false;
		int index = -1;
		
		for (int iter = 0; iter < list.length; iter++) {
			if (list[iter] == value && found == false) {
				found = true;
				index = iter;
			} 
		}
		
		// return the index if found; if not found, index defaults to -1
		if (found) {
			return index; 
		}
		return index;
	}
}
