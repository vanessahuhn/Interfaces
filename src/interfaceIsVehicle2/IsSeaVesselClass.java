package interfaceIsVehicle2;

//la classe IsSeaVesselClass hérite de la classe IsVehicleClass et elle implémente l'interface IsSeaVessel
public class IsSeaVesselClass extends IsVehicleClass implements IsSeaVessel{
	
	//attribut de la classe
	int displacement;

	//méthodes de la classe
	public int getDisplacement() {
		return displacement;
	}

	public void setDisplacement(int displacement) {
		this.displacement = displacement;
	}
		
}
