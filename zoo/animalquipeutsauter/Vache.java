package fr.mercier.zoo.animalquipeutsauter;

public class Vache {

	private String nom;
	private String race;
	private int poids;
	private int age;
	private String couleur;
	private boolean griffes;

	public Vache() {
		super();

	}

	public Vache(String nom, String race, int poids, int age, String couleur, boolean griffes) {
		super();
		this.nom = nom;
		this.race = race;
		this.poids = poids;
		this.age = age;
		this.couleur = couleur;
		this.griffes = griffes;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public int getPoids() {
		return poids;
	}

	public void setPoids(int poids) {
		this.poids = poids;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public boolean isGriffes() {
		return griffes;
	}

	public void setGriffes(boolean griffes) {
		this.griffes = griffes;
	}

}
