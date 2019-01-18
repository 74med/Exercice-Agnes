import java.util.Scanner;

public class Exo_1 {


	/*	Écrire un programme qui lit un mot au clavier et qui indique combien de fois sont
	présentes chacune des voyelles a, e, i, o, u ou y, que celles-ci soient écrites en
	majuscules ou en minuscules, comme dans cet exemple :
	Exemple d’exécution :
	Donnez un mot : Anticonstitutionnellement
	il comporte
	1 fois la lettre a
	3 fois la lettre e
	3 fois la lettre i
	2 fois la lettre o
	1 fois la lettre u
	0 fois la lettre y*/


	public static void main(String[] args) {


		Scanner reader = new Scanner(System.in);

		char[] voyelle = {'a','e','i','o','u','y'}; 	// on creer un tableau appeler voyelle qui contiendra nos voyelle pour les comparer
		int[] count = new int [voyelle.length];			//	creation d'un compteur qui parcours le tableau voyelle


		System.out.println("donnez un mot");			// demande de saisie utilisateur
		String saisie = reader.nextLine().toLowerCase();				// initialisation d'une variable String saisie stocker dans le scanner + method tolowercase pour mettre la saisie en minuscules
		char[] carac = saisie.toCharArray();			// creation d'un tableau qui va transformer le string en caractere individuel


		for(int i = 0; i < carac.length; i++) {			// pour int i est egal a zero, tant que i est plus petit que carac.length alors on incremente de 1
			for(int j = 0; j < voyelle.length; j++) {
				if(carac[i] == voyelle[j]) {
					count[j] += 1;
					
				
				}
				
			}
			
			
		}
		for(int i = 0; i < count.length; i++)
		System.out.println("La voyelle " + voyelle[i] + " est presente "+ count[i] + " fois ");
		reader.close();
	}

}


//	public static int lettreCount(String mots, char lettre)
//	{
//	 int nb = 0;
//	 for (int i=0; i < mots.length(); i++)
//	 {
//	 if (mots.charAt(i) == lettre)
//	 nb++;
//	 }
//	 return nb;
//	}
//	
//	
////Anticonstitutionnellement
//	
//	public static void main(String[] args) {
//
//		
//		Scanner reader = new Scanner(System.in); // ouverture du scanner 
//		String mots = " "; // creation de la variable mots
//		
//		System.out.println("Veuillez entrer un mot s'il vous plait "); // demande de saisie utilisateur
//		mots = reader.nextLine(); //enregistrer donner saisie par l'utilisateur
//		
//		System.out.println(lettreCount(mots));
//	
//			
//	

