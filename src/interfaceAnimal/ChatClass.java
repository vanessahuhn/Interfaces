package interfaceAnimal;

//cr�ation de la classe ChatClass qui h�rite de la classe AnimalClass et impl�mente l'interface Chat
public class ChatClass extends AnimalClass implements Chat{

	//d�claration des m�thodes de la classe
	public void miaule() {
		System.out.println("Miaou !");
	}
	
}
