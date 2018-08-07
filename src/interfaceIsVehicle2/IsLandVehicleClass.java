package interfaceIsVehicle2;

//la classe IsLandVehicleClass hérite de la classe IsVehicleClass
//la classe IsLandVehicleClass implémente l'interface IsLandVehicle
public class IsLandVehicleClass extends IsVehicleClass implements IsLandVehicle {
	
	//attribut de la classe
	int numWheels;

	//méthodes de la classe
	public int getNumWheels() {
		return numWheels;
	}

	public void setNumWheels(int numWheels) {
		this.numWheels = numWheels;
	}
		
}
