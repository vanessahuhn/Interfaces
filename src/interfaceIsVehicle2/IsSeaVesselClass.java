package interfaceIsVehicle2;

//la classe IsSeaVesselClass h�rite de la classe IsVehicleClass et elle impl�mente l'interface IsSeaVessel
public class IsSeaVesselClass extends IsVehicleClass implements IsSeaVessel{
	
	//attribut de la classe
	int displacement;

	//m�thodes de la classe
	public int getDisplacement() {
		return displacement;
	}

	public void setDisplacement(int displacement) {
		this.displacement = displacement;
	}
		
}
