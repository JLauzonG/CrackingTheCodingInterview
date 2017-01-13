package com.linkedlists.problems;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestProblems {
	private LinkedList<String> listJeremy = new LinkedListJeremy<>();

	private LinkedList<String> listArnaud = new LinkedListArnaud<>();

	@Test
	public void testAddFirstJeremy() {
		
		listJeremy.addFirst("First");
		assertEquals(listJeremy.get(0), "First"); 
		
		listJeremy.addFirst("Second");
		assertEquals(listJeremy.get(0), "Second"); 
	}
	
	@Test
	public void testAddFirstArnaud() {

		listArnaud.addFirst("First");
		assertEquals(listArnaud.get(0), "First");

		listArnaud.addFirst("Second");
		assertEquals(listArnaud.get(0), "Second");
	}

	@Test
	public void testAddLastJeremy() {
		listJeremy.addLast("First"); 
		listJeremy.addLast("Second"); 
		listJeremy.addLast("Third");
		assertEquals(listJeremy.get(listJeremy.getSize()-1), "Third"); 
		
		listJeremy.addLast("Fourth");
		assertEquals(listJeremy.get(listJeremy.getSize()-1), "Fourth"); 
	}
	
	@Test
	public void testAddLastArnaud() {
		listArnaud.addLast("First");
		listArnaud.addLast("Second");
		listArnaud.addLast("Third");
		assertEquals(listArnaud.get(listArnaud.getSize() - 1), "Third");

		listArnaud.addLast("Fourth");
		assertEquals(listArnaud.get(listArnaud.getSize() - 1), "Fourth");
	}

	@Test
	public void testAddAfterJeremy() {
		listJeremy.addLast("First"); 
		listJeremy.addLast("Second");
		listJeremy.addLast("Third");
		listJeremy.addLast("Fourth");
		
		listJeremy.addAfter("Fifth", 1);
		assertEquals(listJeremy.get(2), "Fifth"); 
		
		listJeremy.addAfter("Sixth", 3);
		assertEquals(listJeremy.get(4), "Sixth");
	}
	
	@Test
	public void testAddAfterArnaud() {
		listArnaud.addLast("First");
		listArnaud.addLast("Second");
		listArnaud.addLast("Third");
		listArnaud.addLast("Fourth");

		listArnaud.addAfter("Fifth", 1);
		assertEquals(listArnaud.get(2), "Fifth");

		listArnaud.addAfter("Sixth", 3);
		assertEquals(listArnaud.get(4), "Sixth");
	}

	@Test
	public void testDeleteLastJeremy() {
		listJeremy.addLast("First"); 
		listJeremy.addLast("Second");
		listJeremy.addLast("Third");
		listJeremy.addLast("Fourth");
		
		listJeremy.deleteLast();
		assertEquals(listJeremy.get(listJeremy.getSize()-1), "Third"); 
		assertTrue(listJeremy.getSize() == 3);
		
		listJeremy.deleteLast();
		assertEquals(listJeremy.get(listJeremy.getSize()-1), "Second"); 
		assertTrue(listJeremy.getSize() == 2);
	}
	
	@Test
	public void testDeleteLastArnaud() {
		listArnaud.addLast("First");
		listArnaud.addLast("Second");
		listArnaud.addLast("Third");
		listArnaud.addLast("Fourth");

		listArnaud.deleteLast();
		assertEquals(listArnaud.get(listArnaud.getSize() - 1), "Third");
		assertTrue(listArnaud.getSize() == 3);

		listArnaud.deleteLast();
		assertEquals(listArnaud.get(listArnaud.getSize() - 1), "Second");
		assertTrue(listArnaud.getSize() == 2);
	}

	@Test 
	public void testDeleteFirstJeremy() {
		listJeremy.addLast("First"); 
		listJeremy.addLast("Second");
		listJeremy.addLast("Third");
		listJeremy.addLast("Fourth");
		
		listJeremy.deleteFirst(); 
		assertEquals(listJeremy.get(0), "Second"); 
		assertTrue(listJeremy.getSize() == 3); 
		
		listJeremy.deleteFirst(); 
		assertEquals(listJeremy.get(0), "Third"); 
		assertTrue(listJeremy.getSize() == 2);
	}
	
	@Test
	public void testDeleteFirstArnaud() {
		listArnaud.addLast("First");
		listArnaud.addLast("Second");
		listArnaud.addLast("Third");
		listArnaud.addLast("Fourth");

		listArnaud.deleteFirst();
		assertEquals(listArnaud.get(0), "Second");
		assertTrue(listArnaud.getSize() == 3);

		listArnaud.deleteFirst();
		assertEquals(listArnaud.get(0), "Third");
		assertTrue(listArnaud.getSize() == 2);
	}

	@Test
	public void testDeleteAfterJeremy() {
		listJeremy.addLast("First"); 
		listJeremy.addLast("Second");
		listJeremy.addLast("Third");
		listJeremy.addLast("Fourth");
		listJeremy.addLast("Fifth");
		
		listJeremy.deleteAt(2);
		assertEquals(listJeremy.get(2), "Fourth");
		assertTrue(listJeremy.getSize() == 4); 
		
		listJeremy.deleteAt(1);
		assertEquals(listJeremy.get(1), "Fourth"); 
		assertTrue(listJeremy.getSize() == 3); 
	}
	
	@Test
	public void testDeleteAfterArnaud() {
		listArnaud.addLast("First");
		listArnaud.addLast("Second");
		listArnaud.addLast("Third");
		listArnaud.addLast("Fourth");
		listArnaud.addLast("Fifth");

		listArnaud.deleteAt(2);
		assertEquals(listArnaud.get(2), "Fourth");
		assertTrue(listArnaud.getSize() == 4);

		listArnaud.deleteAt(1);
		assertEquals(listArnaud.get(1), "Fourth");
		assertTrue(listArnaud.getSize() == 3);
	}

	@Test
	public void testDeleteItemJeremy() {
		listJeremy.addLast("First"); 
		listJeremy.addLast("Second");
		listJeremy.addLast("Third");
		listJeremy.addLast("Fourth");
		listJeremy.addLast("Fifth");
	
		listJeremy.deleteItem("Third"); 
		assertTrue(listJeremy.getSize() == 4); 
		for (int i = 0; i < listJeremy.getSize(); i++) {
			assertNotEquals(listJeremy.get(i), "Third");
		}
	}
	
	@Test
	public void testDeleteItemArnaud() {
		listArnaud.addLast("First");
		listArnaud.addLast("Second");
		listArnaud.addLast("Third");
		listArnaud.addLast("Fourth");
		listArnaud.addLast("Fifth");

		listArnaud.deleteItem("Third");
		assertTrue(listArnaud.getSize() == 4);
		for (int i = 0; i < listArnaud.getSize(); i++) {
			assertNotEquals(listArnaud.get(i), "Third");
		}
	}

	@Test
	public void testRemoveDuplicatesJeremy() {
		listJeremy.addLast("First"); 
		listJeremy.addLast("Second");
		listJeremy.addLast("Third");
		listJeremy.addLast("Fourth");
		listJeremy.addLast("Fifth");
		listJeremy.addLast("First"); 
		listJeremy.addLast("Second");
		listJeremy.addLast("Third");
		listJeremy.addLast("Fourth");
		listJeremy.addLast("Fifth");
		
		listJeremy.removeDuplicates();
		assertTrue(listJeremy.getSize() == 5); 
		
		int count = 0; 
		for (int i = 0; i < listJeremy.getSize(); i++) {
			if (listJeremy.get(i).equals("First")) {
				count++; 
			}
		}
		assertTrue(count == 1); 
		
		listJeremy.display(); 
	}
	
	@Test
	public void testRemoveDuplicatesArnaud() {
		listArnaud.addLast("First");
		listArnaud.addLast("Second");
		listArnaud.addLast("Third");
		listArnaud.addLast("Fourth");
		listArnaud.addLast("Fifth");
		listArnaud.addLast("First");
		listArnaud.addLast("Second");
		listArnaud.addLast("Third");
		listArnaud.addLast("Fourth");
		listArnaud.addLast("Fifth");

		listArnaud.removeDuplicates();
		assertTrue(listArnaud.getSize() == 5);

		int count = 0;
		for (int i = 0; i < listArnaud.getSize(); i++) {
			if (listArnaud.get(i).equals("First")) {
				count++;
			}
		}
		assertTrue(count == 1);

		listArnaud.display();
	}

	@Test
	public void testIsPalindromeJeremy() {
		listJeremy.addLast("First"); 
		listJeremy.addLast("Second");
		listJeremy.addLast("Third");
		listJeremy.addLast("Fourth");
		listJeremy.addLast("Fifth");
		listJeremy.addLast("Fourth"); 
		listJeremy.addLast("Third");
		listJeremy.addLast("Second");
		listJeremy.addLast("First");
		
		assertTrue(listJeremy.isPalindrome()); 
		listJeremy.addLast("Sixth");
		
		assertFalse(listJeremy.isPalindrome());
	}

	@Test
	public void testIsPalindromeArnaud() {
		listArnaud.addLast("First");
		listArnaud.addLast("Second");
		listArnaud.addLast("Third");
		listArnaud.addLast("Fourth");
		listArnaud.addLast("Fifth");
		listArnaud.addLast("Fourth");
		listArnaud.addLast("Third");
		listArnaud.addLast("Second");
		listArnaud.addLast("First");

		assertTrue(listArnaud.isPalindrome());
		listArnaud.addLast("Sixth");

		assertFalse(listArnaud.isPalindrome());
	}
} 
