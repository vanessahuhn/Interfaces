package exemple2;
//creation de la classe Demo qui implemente l'interface Inf2
//ainsi que par extension l'interface Inf1
public class Demo implements Inf2 {
	//implementation de la méthode method2()
    public void method2() {
    	System.out.println("method2");
    }
    //implementation de la méthode method1()
    public void method1() {
        System.out.println("method1");
    }
    
    public static void main(String args[]) {
    	//creation d'une classe anonyme
    	/*Les classes anonymes sont le plus souvent utilisées pour la gestion d'actions 		ponctuelles, lorsque créer une classe pour un seul traitement est trop lourd. Procéder 		de cette manière revient à créer une classe fille sans être obligé de créer cette classe 		de façon explicite. L'héritage se produit automatiquement.Seulement, la classe créée n'a 		pas de 	nom, l'héritage s'effectue de façon implicite ! Nous bénéficions donc de tous 		les avantages 	de la classe mère en ne redéfinissant que la méthode qui nous intéresse.
    	Sachez aussi que les classes anonymes peuvent être utilisées pour implémenter des 		classes abstraites.*/
    	Inf2 objVar = new Demo();
    	//appel de la méthode method1 sur l'objet objVar_elle est disponible par heritage entre 		les interfaces
    	objVar.method1();
    	//appel de la méthode method2 sur l'objet objVar_elle est disponible car la classe Demo 		implemente l'interface Inf2
    	objVar.method2();
    }

}