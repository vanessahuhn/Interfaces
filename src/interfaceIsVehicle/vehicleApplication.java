package interfaceIsVehicle;

public class vehicleApplication {

	public static void main(String[] args) {
		
		Jeep jeep1 = new Jeep();
		
		jeep1.setName("Jeep Cherokee");
		jeep1.setMaxPassengers(7);
		jeep1.setMaxSpeed(250);
		jeep1.setNumWheels(4);
		
		jeep1.soundHorn();
		
		System.out.println("The " + jeep1.getName() + " has " + jeep1.getNumWheels() + " wheels. It can contain up to " + jeep1.getMaxPassengers() + " passengers and has a maximum speed of " + jeep1.getMaxSpeed() + "km/h.");
		
		Hovercraft hovercraft1 = new Hovercraft();
		
		hovercraft1.setName("BHT 130");
		hovercraft1.setMaxPassengers(130);
		hovercraft1.setMaxSpeed(90);
		hovercraft1.setNumWheels(0);
		hovercraft1.setDisplacement(20000);
		
		hovercraft1.enterLand();
		hovercraft1.enterSea();
		
		System.out.println("The " + hovercraft1.getName() + " has " + hovercraft1.getNumWheels() + " wheels. It can contain up to " + hovercraft1.getMaxPassengers() + " passengers, has a maximum speed of " + hovercraft1.getMaxSpeed() + "km/h and weighs " + hovercraft1.getDisplacement() + "kg.");

	}

}
