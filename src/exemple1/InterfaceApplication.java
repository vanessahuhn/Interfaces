package exemple1;

public class InterfaceApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//création d'une instance de Implinterface1
		Implinterface1 impl1 = new Implinterface1();
		
		//l'instance va donner la note minimale entre 2 étudiants v1 = 14 et v2 = 12
		impl1.setV1(14);
		impl1.setV2(12);
		//donner note min
		System.out.println("La note minimum est " + impl1.minimum() + ".");
		//donner note max
		System.out.println("La note maximum est " + impl1.maximum() + ".");
		
		//donner taille min et taille max entre 3 etudiants avec Implinterface2 sachant que v1 = 165, v2 = 189, v3 = 171
		
		//création d'une instance de Implinterface2
		Implinterface2 impl2 = new Implinterface2();
		
		//l'instance va donner la taille min entre 3 étudiants
		
		//on donne une valeur à v1, v2 et v3
		impl2.setV1(165);
		impl2.setV2(189);
		impl2.setV3(171);
		
		//donner note min
		System.out.println("La taille minimum est " + impl2.minimum() + ".");
		//donner note max
		System.out.println("La taille maximum est " + impl2.maximum() + ".");
	}

}
