package interfaceAnimal;

//cr�ation de la classe ApplicationAnimal qui contient le main
public class ApplicationAnimal {

	public static void main(String[] args) {
		
		//cr�ation de l'instance myChat de la classe ChatClass
		ChatClass myChat = new ChatClass();
		
		//initialisation des attributs de l'instance myChat
		myChat.setNbPattes(4);
		myChat.setNom("F�lix");
		
		//appel des m�thodes pour l'instance myChat
		myChat.marche();
		myChat.miaule();
		myChat.description();
		
		//cr�ation de l'instance myChien de la classe ChienClass
		ChienClass myChien = new ChienClass();
		
		//initialisation des attributs de l'instance myChien
		myChien.setNbPattes(4);
		myChien.setNom("M�dor");
		
		//appel des m�thodes pour l'instance myChien
		myChien.marche();
		myChien.aboie();
		myChien.description();

	}

}
