package interfaceAnimal;

//cr�ation de la classe ChienClass qui h�rite de la classe AnimalClass et impl�mente l'interface Chien
public class ChienClass extends AnimalClass implements Chien{

	//d�claration des m�thodes de la classe
	public void aboie() {
		System.out.println("Ouaf !");
	}
	
}
