package com.stacks.problems;

import java.util.ArrayList;
import java.util.List;

public class AnimalShelter {
	private interface Animal {
		int getPosition(); 
		void enqueue(AnimalShelter shelter, int position);
	}
	
	private class Dog implements Animal {	
		private int position; 
		
		public int getPosition() {
			return position; 
		}
		
		public void enqueue(AnimalShelter shelter, int position) {
			shelter.listDog.add(this);
			this.position = position; 
		}
	}
	
	private class Cat implements Animal {
		private int position;
		
		public int getPosition() {
			return position; 
		}
		
		public void enqueue(AnimalShelter shelter, int position) {
			shelter.listCat.add(this);
			this.position = position; 
		}
	}
	
	public static int animalPosition = 0;
	
	private List<Dog> listDog; 
	private List<Cat> listCat; 
	
	public AnimalShelter() {
		listDog = new ArrayList<>(); 
		listCat = new ArrayList<>(); 
	}
	
	public void enqueue(Animal animal) {
		animal.enqueue(this, ++animalPosition);
	}
	
	public Animal dequeue() {
		return listDog.get(0).position < listCat.get(0).position ? listDog.remove(0) : listCat.remove(0); 
	}
	
	public Animal dequeueDog() {
		return listDog.remove(0);
	}
	
	public Animal dequeueCat() {
		return listDog.remove(0);
	}
}
