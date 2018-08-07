package interfaceIsVehicle2;

//la classe Jeep hérite de la classe IsLandVehicleClass et elle implémente l'interface IsLandVehicle
public class Jeep extends IsLandVehicleClass implements IsLandVehicle {

	//méthode de la classe
	public void soundHorn() {
		System.out.println("COIN COIN !!");
	}
}
