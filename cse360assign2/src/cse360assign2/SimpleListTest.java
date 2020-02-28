package cse360assign2;

/**
 * JUnit Tester Class for the SimpleList class.
 * @author Jayanth Rao
 * @ClassID 370
 * @Assignment Assignment #2
 * 
 */

import static org.junit.jupiter.api.Assertions.*;
import org.junit.*;

public class SimpleListTest {
	
	/**
	 * Tests whether the SimpleList object is not null.
	 */
	@Test
	public void testCreateSimpleList() {
		SimpleList list = new SimpleList();
		assertNotNull(list);
	}
	
	/**
	 * Tests whether the SimpleList object is null. SHOULD FAIL.
	 */
	@Test
	public void testCreateSimpleListFail() {
		SimpleList list = new SimpleList();
		assertNull(list);
	}
	
	/**
	 * Tests whether the values are being added in the 
	 * correct order.
	 */
	@Test
	public void testAdd() {
		SimpleList list = new SimpleList();
		list.add(1);
		list.add(2);
		list.add(3);
		
		String expected_output = "3 2 1 0 0 0 0 0 0 0";
		String actual_output = list.toString();
		
		assertEquals(expected_output, actual_output);
	}
	
	@Test
	public void testRemoveNormal() {
		SimpleList list = new SimpleList();
		list.add(5);
		list.add(3);
		list.add(2);
		list.add(5);
		list.add(7);
		list.add(12);
		list.add(15);
		list.add(16);
		list.add(2);
		list.add(4);
		
		list.remove(4);
		
		String list_string = list.toString();
		String expected = "2 16 15 12 7 5 2 3 5 0";
		assertEquals(expected, list_string);
	}
	
	/**
	 * Tests whether the value specified is being removed from the list
	 * as well as cuts down the length of the list by 25% of the current
	 * length.
	 */
	@Test
	public void testRemoveCutLength() {
		SimpleList list = new SimpleList();
		list.add(5);
		list.add(3);
		list.add(2);
		list.add(5);
		
		list.remove(5);
		
		String list_string = list.toString();
		String expected = "2 3 5 0 0 0 0 0";
		assertEquals(expected, list_string);
	}
	
	/**
	 * Tests whether the value specified is NOT being removed from 
	 * the list.
	 */
	@Test
	public void testRemoveFail() {
		SimpleList list = new SimpleList();
		list.add(5);
		list.add(3);
		list.add(2);
		list.add(5);
		
		list.remove(5);
		
		String list_string = list.toString();
		String expected = "5 2 3 0 0 0 0 0 0 0";
		assertNotEquals(expected, list_string);
	}
	
	/**
	 * Tests whether the correct number of values are being 
	 * returned by the count() method.
	 */
	@Test
	public void testCount() {
		SimpleList list = new SimpleList();
		list.add(5);
		list.add(10);
		list.add(12);
		list.add(3);
		
		int actual = list.count();
		int expected = 4;
		
		assertEquals(expected, actual);
	}
	
	/**
	 * Tests whether the WRONG number of values are being 
	 * returned by the count() method.
	 */
	@Test
	public void testCountFail() {
		SimpleList list = new SimpleList();
		list.add(5);
		list.add(10);
		list.add(12);
		list.add(3);
		
		int actual = list.count();
		int expected = 7;
		
		assertNotEquals(expected, actual);
	}
	
	/**
	 * Tests whether the SimpleList toString() method is returning
	 * the correct String pattern with the values formatted correctly
	 * and no trailing whitespace.
	 */
	@Test
	public void testToString() {
		SimpleList list = new SimpleList();
		list.add(5);
		list.add(10);
		list.add(12);
		list.add(3);
		
		String list_string = "The values in the list are: " + list.toString();
		String expected = "The values in the list are: 3 12 10 5 0 0 0 0 0 0";
		
		assertEquals(expected, list_string);
	}
	
	/**
	 * Tests whether the SimpleList toString() method is returning
	 * the correct String pattern with the values formatted correctly
	 * and no trailing whitespace.
	 */
	@Test
	public void testToStringFail() {
		SimpleList list = new SimpleList();
		list.add(5);
		list.add(10);
		list.add(12);
		list.add(3);
		
		String list_string = "The values in the list are: " + list.toString();
		// expected string has a trailing whitespace
		String expected = "The values in the list are: 3 12 10 5 0 0 0 0 0 0 ";
		
		assertNotEquals(expected, list_string);
	}
	
	/**
	 * Tests whether the search() function is operating correctly
	 * by searching for a value that exists as well as a value that
	 * does not exist in the list.
	 */
	@Test
	public void testSearch() {
		SimpleList list = new SimpleList();
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(5);
		
		int found_index = list.search(5);
		int expected_index = 0;
		
		assertEquals(expected_index, found_index);
		
		int not_found_index = list.search(125);
		expected_index = -1;
		assertEquals(expected_index, not_found_index);
	}
	
	/**
	 * This test should fail because the value does not exist in the list,
	 * so search() should return -1.
	 */
	@Test
	public void testSearchFail() {
		SimpleList list = new SimpleList();
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(5);
		
		int expected_index = -1;
		int not_found_index = list.search(125);
		expected_index = -1;
		assertEquals(expected_index, not_found_index);
	}
	
	@Test
	public void countOverflow() {
		SimpleList list = new SimpleList();
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(5);
		list.add(3);
		list.add(1);
		list.add(7);
		list.add(8);
		list.add(2);
		list.add(4);
		list.add(10);
		String listString = "The values in the list are: " + list.toString();
		String expectedString = "The values in the list are: "
				+ "10 4 2 8 7 1 3 5 7 6 5 0 0 0 0";
		
		assertEquals(listString, expectedString);
	}
	
	@Test
	public void returnSizeTest() {
		SimpleList list = new SimpleList();
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(5);
		list.add(3);
		list.add(1);
		
		String listString = "The size of the list is: " + list.size();
		String expectedString = "The size of the list is: 10";
		
		assertEquals(listString, expectedString);
	}
	
	@Test
	public void returnFirstTest() {
		SimpleList list = new SimpleList();
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(5);
		list.add(3);
		list.add(1);
		
		String listString = "The first value in the list is: " + list.first();
		String expectedString = "The first value in the list is: 1";
		
		assertEquals(listString, expectedString);
	}
	
	@Test
	public void returnLastTest() {
		SimpleList list = new SimpleList();
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(5);
		list.add(3);
		list.add(1);
		
		String listString = "The last value in the list is: " + list.last();
		String expectedString = "The last value in the list is: 5";
	
		assertEquals(listString, expectedString);
	}
	
	@Test
	public void testAppend() {
		SimpleList list = new SimpleList();
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(5);
		list.add(3);
		list.add(1);
		
		list.append(12);
		
		String list_string = "The values in the list are: " + list.toString();
		// expected string has a trailing whitespace
		String expected = "The values in the list are: 1 3 5 7 6 5 12 0 0 0";
		
		assertEquals(expected, list_string);
	}
}
