package interfaceHotel;

public class HotelCinqEtoiles implements HotelLuxe {
	
	public int longueurPiscine;
	public String modeleTaxi;
	
	public void descriptionPiscineLuxe() {
        System.out.println("La piscine fait " + longueurPiscine + " m�tres de long.");
    }
	
	public int getLongueurPiscine() {
		return longueurPiscine;
	}

	public void setLongueurPiscine(int longueurPiscine) {
		this.longueurPiscine = longueurPiscine;
	}

	public String getModeleTaxi() {
		return modeleTaxi;
	}

	public void setModeleTaxi(String modeleTaxi) {
		this.modeleTaxi = modeleTaxi;
	}

	public void reserverTaxiLuxe() {
		System.out.println("Mod�le du taxi r�serv� : " + modeleTaxi);
    }

}
