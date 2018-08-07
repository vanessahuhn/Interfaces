package interfaceIsVehicle2;

//la classe IsLandVehicleClass h�rite de la classe IsVehicleClass
//la classe IsLandVehicleClass impl�mente l'interface IsLandVehicle
public class IsLandVehicleClass extends IsVehicleClass implements IsLandVehicle {
	
	//attribut de la classe
	int numWheels;

	//m�thodes de la classe
	public int getNumWheels() {
		return numWheels;
	}

	public void setNumWheels(int numWheels) {
		this.numWheels = numWheels;
	}
		
}
