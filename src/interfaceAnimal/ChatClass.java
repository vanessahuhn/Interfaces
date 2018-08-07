package interfaceAnimal;

//création de la classe ChatClass qui hérite de la classe AnimalClass et implémente l'interface Chat
public class ChatClass extends AnimalClass implements Chat{

	//déclaration des méthodes de la classe
	public void miaule() {
		System.out.println("Miaou !");
	}
	
}
