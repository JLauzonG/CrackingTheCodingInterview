package com.linkedlists.problems;

public interface LinkedList<TYPE> {
	
	public void addFirst(TYPE value); 
	
	public void addLast(TYPE value); 
	
	public void addAfter(TYPE value, int index); 
	
	public void deleteFirst(); 
	
	public void deleteLast(); 
	
	public void deleteItem(TYPE item); 
	
	public void deleteAt(int index); 
	
	public int getSize(); 

	public TYPE get(int index);
	
	public void display();
	
	public void removeDuplicates(); 
	
	public boolean isPalindrome(); 
}
