package org.animals;

public class Giraffe extends Animal{
	public Giraffe(String type,String color, int weight, int age) {
		super(type,color, weight, age);
	}

	@Override
	public boolean isVegetarian() {
		return false;
	}

	@Override
	public boolean canClimb() {
		return true;
	}

	@Override
	public void sound() {
		System.out.println("Giraffe no sound");
	}
}