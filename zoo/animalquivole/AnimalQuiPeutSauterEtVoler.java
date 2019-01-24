package fr.mercier.zoo.animalquivole;

import fr.mercier.zoo.animalquipeutsauter.AnimalQuiPeutSauter;

public class AnimalQuiPeutSauterEtVoler extends AnimalQuiPeutSauter {

	protected int longueurAiles;

	public AnimalQuiPeutSauterEtVoler() {
		super();
	}

	public AnimalQuiPeutSauterEtVoler(String nom, String race, int poids, int age, String couleur, boolean griffes) {
		super(nom, race, poids, age, couleur, griffes);
	}

	public void voler() {
		System.out.println("Je vooole !");
	}

	public int getLongueurAiles() {
		return longueurAiles;
	}

	public void setLongueurAiles(int longueurAiles) {
		// this.longueurAiles = longueurAiles;
	}

}
