package fr.mercier.zoo.animalquinage;

import fr.mercier.zoo.animal.Animal;

public class AnimalQuiNage extends Animal {

	public AnimalQuiNage() {
		super();
	}

	public AnimalQuiNage(String nom, String race, int poids, int age, String couleur, boolean griffes) {
		super(nom, race, poids, age, couleur, griffes);
	}

	public void nager() {
		System.out.println("Je nage");
	}
}
