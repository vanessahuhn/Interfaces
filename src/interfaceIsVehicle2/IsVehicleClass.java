package interfaceIsVehicle2;

//la classe IsVehicleClass implémente l'interface IsVehicle
public class IsVehicleClass implements IsVehicle {
	
	//attributs de la classe
	String name;
	int maxPassengers;
	int maxSpeed;
	
	//méthodes de la classe
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMaxPassengers() {
		return maxPassengers;
	}
	public void setMaxPassengers(int maxPassengers) {
		this.maxPassengers = maxPassengers;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	
}
