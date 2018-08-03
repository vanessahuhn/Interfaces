package interfaceHotel;

public class HotelApplication {

	public static void main(String[] args) {
		//cr�ation d'une instance de la classe HotelCinqEtoiles
		HotelCinqEtoiles hotel5 = new HotelCinqEtoiles();
		
		//initialisation de la longueur de la piscine
		hotel5.setLongueurPiscine(25);
		//initialisation du mod�le du taxi
		hotel5.setModeleTaxi("Renault Laguna");
		//appel m�thodes pour afficher les infos sur la piscine et le taxi
		hotel5.descriptionPiscineLuxe();
		hotel5.reserverTaxiLuxe();
		
		//cr�ation d'une instance de la classe HotelSeptEtoiles
		HotelSeptEtoiles hotel7 = new HotelSeptEtoiles();
				
		//initialisation de la longueur de la piscine
		hotel7.setLongueurPiscine(50);
		//initialisation du mod�le du taxi
		hotel7.setModeleTaxi("Mercedes Class C");
		//appel m�thodes pour afficher les infos sur la piscine et le taxi
		hotel7.descriptionPiscineLuxe();
		hotel7.reserverTaxiLuxe();

	}

}
