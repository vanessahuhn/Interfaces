package interfaceIsVehicle2;

public class Hovercraft extends IsLandVehicleClass implements IsLandVehicle, IsSeaVessel {
	
	//attributs de la classe
	int displacement;

	//méthodes de la classe
	public int getDisplacement() {
		return displacement;
	}

	public void setDisplacement(int displacement) {
		this.displacement = displacement;
	}
	
	public void enterLand() {
		System.out.println("Je glisse sur terre.");
	}
	
	public void enterSea() {
		System.out.println("Je glisse sur l'eau.");
	}
	

}
