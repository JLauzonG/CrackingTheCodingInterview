package com.stacks.problems;

import java.util.LinkedList;
import java.util.List;

public class SetOfStacks<T> {	
	private class Stack<T> {
		private class Node<T> {
			private T value; 
			private Node<T> next;
			
			public Node(T value) {
				this.value = value; 
			}
		}
		
		private Node<T> top;
		private int size; 
		
		public void push(T value) {
			Node node = new Node(value); 
			node.next = top; 
			top = node; 
			size++;
		}
		
		public void pop() {
			top = top.next;
			size--;
		}
		
		public T peek() {
			return top.value; 
		}
		
		public boolean isEmpty() {
			return top == null; 
		}
	}
	
	private List<Stack<T>> listOfStacks; 
	private int maxStackSize; 
	private int currentStack; 
	
	public SetOfStacks(int maxStackSize) {
		this.maxStackSize = maxStackSize;
		listOfStacks = new LinkedList<Stack<T>>();
	}
	
	public void push(T value) {
		if (listOfStacks.get(currentStack).size >= maxStackSize-1) {
			Stack<T> newStack = new Stack<T>(); 
			listOfStacks.add(newStack); 
			currentStack++; 
		}
		
		listOfStacks.get(currentStack).push(value);
	}
	
	public void pop() {
		if (currentStack > 0 && listOfStacks.get(currentStack).size == 1) {
			listOfStacks.set(currentStack, null);
			currentStack--; 
		}
		else {
			listOfStacks.get(currentStack).pop(); 
		}
	}
}