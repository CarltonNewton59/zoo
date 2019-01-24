package fr.mercier.zoo;

import fr.mercier.zoo.animalquinage.Requin;
import fr.mercier.zoo.animalquipeutsauter.Chat;
import fr.mercier.zoo.animalquipeutsauter.Chien;
import fr.mercier.zoo.animalquivole.Aigle;

public class Main {

	public static void main(String[] args) {
		Chien rex = new Chien("Rex", "Berger", 15, 12, "Jaune", true);

		System.out.println(rex.getRace());

		Chat tom = new Chat("Tom", "Birman", 8, 6, "Rouge", true);
		System.out.println(tom.getNom());

		// Aigle
		Aigle petitAigle = new Aigle("Grand coeur", "Royal", 1, 12, "Noir", true);

		System.out.println(petitAigle.getNom());

		petitAigle.manger();
		petitAigle.sauter();
		petitAigle.voler();

		Requin sharkos = new Requin("Sharky", "Razor", 100, 20, "bleu", false);
		System.out.println(sharkos.getNom());

		sharkos.nager();

	}
}
