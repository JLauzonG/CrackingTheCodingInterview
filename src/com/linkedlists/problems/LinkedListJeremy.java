package com.linkedlists.problems;

import java.util.HashSet;

public class LinkedListJeremy<TYPE> implements LinkedList<TYPE> {

	@SuppressWarnings("hiding")
	private class Node<TYPE> {
		public TYPE value; 
		public Node<TYPE> prev; 
		public Node<TYPE> next; 
		
		public Node(TYPE value) {
			this.value= value; 
		}
	}
	
	private int size;
	private Node<TYPE> first; 
	private Node<TYPE> last; 
	
	@Override
	public void addFirst(TYPE value) {
		if (first == null) {
			first = new Node<TYPE>(value); 
			last = first; 
		}
		else {
			Node<TYPE> node = new Node<TYPE>(value); 
			node.next = first; 
			first.prev = node; 
			first = node; 
		}
		
		size++;
	}

	@Override
	public void addLast(TYPE value) {
		if (first == null) {
			first = new Node<TYPE>(value); 
			last = first;
		}
		else {
			Node<TYPE> node = new Node<TYPE>(value); 
			node.prev = last; 
			last.next = node; 
			last = node; 
		}
		
		size++;
	}

	@Override
	public void addAfter(TYPE value, int index) {
		if (size > index) {
			Node<TYPE> nodeAtIndex = getNode(index); 
			Node<TYPE> newNode = new Node<TYPE>(value); 
			newNode.prev = nodeAtIndex; 
			newNode.next = nodeAtIndex.next; 
			newNode.next.prev = newNode; 
			nodeAtIndex.next = newNode; 
			
			size++;
		}
	}

	@Override
	public TYPE get(int index) {
		return getNode(index).value; 
	}

	@Override
	public void deleteFirst() {
		first = first.next; 
		first.prev = null; 
		
		size--;
	}

	@Override
	public void deleteLast() {
		last = last.prev; 
		last.next = null; 
		
		size--;
	}

	@Override
	public void deleteItem(TYPE item) {
		Node<TYPE> currentNode = first; 
		while (currentNode.value != item) {
			currentNode = currentNode.next;
		}
		
		deleteNode(currentNode); 
	}

	@Override
	public void deleteAt(int index) {
		deleteNode(getNode(index));  
	}
	
	@Override
	public int getSize() {
		return size; 
	}

	@Override
	public void display() {
		Node<TYPE> currentNode = first; 
		while (currentNode.next != null) {
			System.out.print("[" + currentNode.value.toString() + "]-->");
			currentNode = currentNode.next; 
		}
		System.out.print("[" + currentNode.value.toString() + "]");
	}
	
	private void deleteNode(Node<TYPE> node) {
		if (node.equals(first)) {
			deleteFirst(); 
		}
		else if (node.equals(last)) {
			deleteLast(); 
		}
		else {
			node.prev.next = node.next; 
			node.next.prev = node.prev; 
			size--; 
		}
	}

	private Node<TYPE> getNode(int index) {
		if (index >= size) {
			return null; 
		}
		
		if (index <= (size / 2)) {
			return frontSearch(index); 
		}
		else {
			return backSearch(index); 
		}
	}
	
	private Node<TYPE> frontSearch(int index) {
		Node<TYPE> currentNode = first; 
		for (int i = 0; i < index; i++) {
			currentNode = currentNode.next; 
		}
		
		return currentNode; 
	}
	
	private Node<TYPE> backSearch(int index) {
		Node<TYPE> currentNode = last; 
		for (int i = size-1; i > index; i--) {
			currentNode = currentNode.prev; 
		}
		
		return currentNode; 
	}

	@Override
	public void removeDuplicates() {
		HashSet<TYPE> hashSet = new HashSet<>(); 
		Node<TYPE> currentNode = first; 
		hashSet.add(currentNode.value);
		
		while(currentNode.next != null) {
			currentNode = currentNode.next; 
			if (!hashSet.add(currentNode.value)) {
				deleteNode(currentNode);
			}
		}
	}

	@Override
	public boolean isPalindrome() {
		Node<TYPE> frontNode = first; 
		Node<TYPE> backNode = last; 
		for (int i = 0; i < (size/2); i++) {
			if (!frontNode.value.equals(backNode.value)) {
				return false;
			}
			frontNode = frontNode.next; 
			backNode = backNode.prev; 
		}
		
		return frontNode.value.equals(backNode.value); 
	}
}
