package interfaceAnimal;

//création de la classe AnimalClass qui implémente l'interface Animal
public class AnimalClass implements Animal{
	
	//déclaration des variables de la classe
	String nom;
	int nbPattes;
	
	//déclaration des getters et setters de la classe AnimalClass
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNbPattes() {
		return nbPattes;
	}

	public void setNbPattes(int nbPattes) {
		this.nbPattes = nbPattes;
	}

	//déclaration des méthodes de la classe
	public void marche() {
		System.out.println("Votre animal s'avance vers vous.");
	}
	
	public void description() {
		System.out.println("Il s'appelle " + getNom() + ". Il a " + getNbPattes() + " pattes.");
	}
}
