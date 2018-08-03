package interfaceHotel;

public class HotelApplication {

	public static void main(String[] args) {
		//création d'une instance de la classe HotelCinqEtoiles
		HotelCinqEtoiles hotel5 = new HotelCinqEtoiles();
		
		//initialisation de la longueur de la piscine
		hotel5.setLongueurPiscine(25);
		//initialisation du modèle du taxi
		hotel5.setModeleTaxi("Renault Laguna");
		//appel méthodes pour afficher les infos sur la piscine et le taxi
		hotel5.descriptionPiscineLuxe();
		hotel5.reserverTaxiLuxe();
		
		//création d'une instance de la classe HotelSeptEtoiles
		HotelSeptEtoiles hotel7 = new HotelSeptEtoiles();
				
		//initialisation de la longueur de la piscine
		hotel7.setLongueurPiscine(50);
		//initialisation du modèle du taxi
		hotel7.setModeleTaxi("Mercedes Class C");
		//appel méthodes pour afficher les infos sur la piscine et le taxi
		hotel7.descriptionPiscineLuxe();
		hotel7.reserverTaxiLuxe();

	}

}
