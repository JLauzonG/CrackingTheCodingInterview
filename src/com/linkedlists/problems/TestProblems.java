package com.linkedlists.problems;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestProblems {
	private LinkedList<String> listJeremy = new LinkedListJeremy<>(); 

	@Test
	public void testAddFirstJeremy() {
		
		listJeremy.addFirst("First");
		assertEquals(listJeremy.get(0), "First"); 
		
		listJeremy.addFirst("Second");
		assertEquals(listJeremy.get(0), "Second"); 
	}
	
	@Test
	public void testAddLast() {
		listJeremy.addLast("First"); 
		listJeremy.addLast("Second"); 
		listJeremy.addLast("Third");
		assertEquals(listJeremy.get(listJeremy.getSize()-1), "Third"); 
		
		listJeremy.addLast("Fourth");
		assertEquals(listJeremy.get(listJeremy.getSize()-1), "Fourth"); 
	}
	
	@Test
	public void testAddAfter() {
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
	public void testDeleteLast() {
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
	public void testDeleteFirst() {
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
	public void testDeleteAfter() {
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
	public void testDeleteItem() {
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
	public void testRemoveDuplicates() {
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
	public void testIsPalindrome() {
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
} 
