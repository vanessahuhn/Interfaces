package interfaceIsVehicle2;

//la classe Jeep h�rite de la classe IsLandVehicleClass et elle impl�mente l'interface IsLandVehicle
public class Jeep extends IsLandVehicleClass implements IsLandVehicle {

	//m�thode de la classe
	public void soundHorn() {
		System.out.println("COIN COIN !!");
	}
}
