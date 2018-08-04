package exemple2;
//creation de la classe Demo qui implemente l'interface Inf2
//ainsi que par extension l'interface Inf1
public class Demo implements Inf2 {
	//implementation de la m�thode method2()
    public void method2() {
    	System.out.println("method2");
    }
    //implementation de la m�thode method1()
    public void method1() {
        System.out.println("method1");
    }
    
    public static void main(String args[]) {
    	//creation d'une classe anonyme
    	/*Les classes anonymes sont le plus souvent utilis�es pour la gestion d'actions 		ponctuelles, lorsque cr�er une classe pour un seul traitement est trop lourd. Proc�der 		de cette mani�re revient � cr�er une classe fille sans �tre oblig� de cr�er cette classe 		de fa�on explicite. L'h�ritage se produit automatiquement.Seulement, la classe cr��e n'a 		pas de 	nom, l'h�ritage s'effectue de fa�on implicite ! Nous b�n�ficions donc de tous 		les avantages 	de la classe m�re en ne red�finissant que la m�thode qui nous int�resse.
    	Sachez aussi que les classes anonymes peuvent �tre utilis�es pour impl�menter des 		classes abstraites.*/
    	Inf2 objVar = new Demo();
    	//appel de la m�thode method1 sur l'objet objVar_elle est disponible par heritage entre 		les interfaces
    	objVar.method1();
    	//appel de la m�thode method2 sur l'objet objVar_elle est disponible car la classe Demo 		implemente l'interface Inf2
    	objVar.method2();
    }

}