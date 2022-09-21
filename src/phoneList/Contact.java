package phoneList;

import java.text.NumberFormat;

/*
 * This contains info for a single contact
 * 
 * Parameters Needed to Store
 *   - Contact's Name
 *   - Contact's Phone Number
 *   
 * Needed Methods
 *   - Constructor(s)
 *   - getter methods
 *   - Setter methods not necessary unless Constructor
 *        initialize variables.
 *   - Override toString() so that Contact can
 *        be printed as part of a list.
 * 
 */



public class Contact {
	private String name;
	private String number;
	
	public Contact(String ContactName, String ContactNumber) {
		name = ContactName;
		number = ContactNumber;
	}
	
	public String getName() { // gets name
		return name;
	}
	
	public String getNumber() { // gets number
		return number;
	}
	
	public String toString() { // prints info
		return name + ": " + number;
	}
}
