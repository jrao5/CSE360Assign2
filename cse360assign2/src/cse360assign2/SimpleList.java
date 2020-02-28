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
		//System.out.println("Initial List Length: " + list.length);
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
		count++;
		
        if (count <= list.length) { // if the list is not fully filled
            int[] tempArr = new int[list.length];
            
            for (int i = 1; i < list.length; i++) {
                tempArr[i] = list[i - 1];
            }
            
            tempArr[0] = value;
            list = tempArr;
        } else { // if the list is fully filled and a new value is being added
            int newLength = (int) (list.length + list.length / 2);
            int[] tempArr = new int[newLength];
            
            for (int i = 1; i < list.length + 1; i++) {
                tempArr[i] = list[i - 1];
            }
            
            tempArr[0] = value;
            list = tempArr;
        }
	}
	
	/**
	 * Removes the specified value from the list. Also updates the count
	 * of values in the list.
	 * @param value The value to be removed; int
	 */ 
	public void remove(int value) {
        int index = search(value);
        int emptySpaces = list.length - count;
        int quarterLength = (int) (list.length / 4); // cast as int to floor the value

        if (emptySpaces > quarterLength) { // if there are more empty spaces than 25% of the list
            int newLength = list.length - quarterLength;
            int[] tempArr = new int[newLength];
            
            System.arraycopy(list, 0, tempArr, 0, index);
            System.arraycopy(list, index + 1, tempArr, index, tempArr.length - index);
            
            list = tempArr;
            
            count--;
        } else { // if there are fewer empty spaces than 25% of the list
            int[] tempArr = new int[list.length];
            System.arraycopy(list, 0, tempArr, 0, index);
            System.arraycopy(list, index + 1, tempArr, index, list.length - index - 1);
            
            list = tempArr;
            
            count--;
        }
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
	
	/**
	 * append a value to the first empty space in the list.
	 * @param value = the value to append
	 */
	public void append(int value) {
		count++;
        
        if (count <= list.length) { // if the list is not fully filled
            list[count - 1] = value; // set it to the first empty space available.
        } else {
        	// same logic as adding a new value
            int newLength = (int) (list.length + list.length / 2);
            int[] tempArr = new int[newLength];
            
            for (int i = 1; i < list.length; i++) {
                tempArr[i] = list[i - 1];
            }
            
            tempArr[count - 1] = value; // set it to the first empty space
            list = tempArr;
        }
	}
	
	/**
	 * return the first value in the list, or -1 if the list is empty
	 * @return
	 */
	public int first() {
		if (count > 0) {
			return list[0];
		}
		return -1;
	}
	
	/**
	 * return the last value in the list, or -1 if the list is empty
	 * @return
	 */
	public int last() {
		if (count > 0) {
			return list[count - 1];
		}
		return -1;
	}
	
	/**
	 * return the overall size of the list, including empty spaces
	 * @return
	 */
	public int size() {
		return list.length;
	}
}
