package interfaceIsVehicle;

public class vehicleApplication {

	public static void main(String[] args) {
		
		//création d'une instance jeep1 de la classe Jeep
		Jeep jeep1 = new Jeep();
		
		//instanciation des attributs de la classe Jeep
		jeep1.setName("Jeep Cherokee");
		jeep1.setMaxPassengers(7);
		jeep1.setMaxSpeed(250);
		jeep1.setNumWheels(4);
		
		//appel de la méthode soundHorn() pour l'instance jeep1
		jeep1.soundHorn();
		
		//afficher la description de l'instance jeep1
		System.out.println("The " + jeep1.getName() + " has " + jeep1.getNumWheels() + " wheels. It can contain up to " + jeep1.getMaxPassengers() + " passengers and has a maximum speed of " + jeep1.getMaxSpeed() + "km/h.");
		
		//création d'une instance hovercraft1 de la classe Hovercraft
		Hovercraft hovercraft1 = new Hovercraft();
		
		//instanciation des attributs de la classe Hovercraft
		hovercraft1.setName("BHT 130");
		hovercraft1.setMaxPassengers(130);
		hovercraft1.setMaxSpeed(90);
		hovercraft1.setNumWheels(0);
		hovercraft1.setDisplacement(20000);
		
		//appel des méthodes enterLand() et enterSea() pour l'instance hovercraft1
		hovercraft1.enterLand();
		hovercraft1.enterSea();
		
		//afficher la description de l'instance hovercraft1
		System.out.println("The " + hovercraft1.getName() + " has " + hovercraft1.getNumWheels() + " wheels. It can contain up to " + hovercraft1.getMaxPassengers() + " passengers, has a maximum speed of " + hovercraft1.getMaxSpeed() + "km/h and weighs " + hovercraft1.getDisplacement() + "kg.");

	}

}
