package interfaceIsVehicle2;

public class ApplicationVehicle {

	public static void main(String[] args) {
		//création d'une instance de la classe Jeep
		Jeep myJeep = new Jeep();
		
		//initialisation des valeurs des attributs pour l'instance myJeep
		myJeep.setMaxPassengers(6);
		myJeep.setMaxSpeed(200);
		myJeep.setName("Ghislaine");
		myJeep.setNumWheels(4);
		
		//afficher un message avec les informations sur ma jeep
		System.out.println("Ma jeep s'appelle " + myJeep.getName() + ", elle peut transporter jusqu'à " +  myJeep.getMaxPassengers() + " passagers, rouler jusqu'à " + myJeep.getMaxSpeed() + " km/h et possède " + myJeep.getNumWheels() + " roues.");
		
		//création d'une instance de la class Hovercraft
		Hovercraft myHovercraft = new Hovercraft();
		
		//initialisation des valeurs des attributs pour l'instance myHovercraft
		myHovercraft.setDisplacement(20);
		myHovercraft.setMaxPassengers(50);
		myHovercraft.setMaxSpeed(70);
		myHovercraft.setName("Jacqueline");
		myHovercraft.setNumWheels(0);

		//afficher un message avec les informations sur mon hovercraft
		System.out.println("Mon hovercraft s'appelle " + myHovercraft.getName() + ", il peut transporter jusqu'à " +  myHovercraft.getMaxPassengers() + " passagers, aller jusqu'à " + myHovercraft.getMaxSpeed() + " km/h, possède " + myHovercraft.getNumWheels() + " roues et a un poids de " + myHovercraft.getDisplacement() + " tonnes.");
		
	}

}
