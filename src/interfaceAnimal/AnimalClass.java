package interfaceAnimal;

//cr�ation de la classe AnimalClass qui impl�mente l'interface Animal
public class AnimalClass implements Animal{
	
	//d�claration des variables de la classe
	String nom;
	int nbPattes;
	
	//d�claration des getters et setters de la classe AnimalClass
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

	//d�claration des m�thodes de la classe
	public void marche() {
		System.out.println("Votre animal s'avance vers vous.");
	}
	
	public void description() {
		System.out.println("Il s'appelle " + getNom() + ". Il a " + getNbPattes() + " pattes.");
	}
}
