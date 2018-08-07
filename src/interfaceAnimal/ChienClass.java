package interfaceAnimal;

//création de la classe ChienClass qui hérite de la classe AnimalClass et implémente l'interface Chien
public class ChienClass extends AnimalClass implements Chien{

	//déclaration des méthodes de la classe
	public void aboie() {
		System.out.println("Ouaf !");
	}
	
}
