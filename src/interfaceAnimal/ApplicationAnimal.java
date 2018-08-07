package interfaceAnimal;

//création de la classe ApplicationAnimal qui contient le main
public class ApplicationAnimal {

	public static void main(String[] args) {
		
		//création de l'instance myChat de la classe ChatClass
		ChatClass myChat = new ChatClass();
		
		//initialisation des attributs de l'instance myChat
		myChat.setNbPattes(4);
		myChat.setNom("Félix");
		
		//appel des méthodes pour l'instance myChat
		myChat.marche();
		myChat.miaule();
		myChat.description();
		
		//création de l'instance myChien de la classe ChienClass
		ChienClass myChien = new ChienClass();
		
		//initialisation des attributs de l'instance myChien
		myChien.setNbPattes(4);
		myChien.setNom("Médor");
		
		//appel des méthodes pour l'instance myChien
		myChien.marche();
		myChien.aboie();
		myChien.description();

	}

}
