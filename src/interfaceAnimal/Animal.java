package interfaceAnimal;

//cr�ation de l'interface Animal
public interface Animal {
	
	//signatures des getters et setters de la classe AnimalClass
	public String getNom();

	public void setNom(String nom);

	public int getNbPattes();

	public void setNbPattes(int nbPattes);

	//signatures des m�thodes de la classe AnimalClass
	public void marche();
	
	public void description();

}
