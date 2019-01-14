import java.util.Scanner;

//1. Creer une var nb aleatoire entre 0 et 1000 									££
//2. Creer un Syso,  demande de saisie. 											££
//3. Creer une var saisie utilisateur 												££
//4. Creer une condition de limite sur la sasie entre 0 et 1000.
//5. Creer une autre condition pour comparer la saisie avec le nombre generer
//6. Creer une boucle pour relancer le programme si le nombre na pas ete trouver
//7. Compteur du nombre de tour de la boucle.
//8. Creer un boolean pour sortir de la boucle si saisie = nb aleatoire.
//9. Afficher le compteur quand nb est trouver.


public class Exo1_6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int nb = (int) (Math.random() * 1001);
		System.out.println(nb);
		int count = 0;
		boolean verif = true;
		while (verif) {
			count++;
			//System.out.println(nb);
			System.out.println("Veuillez entrer un nombre ");
			int saisie = sc.nextInt();

			if (saisie >= 0 && saisie <= 1000) {
				if (saisie > nb) {
					System.out.println("C'est moins !");

				}

				else if (saisie < nb){
					System.out.println("Cest plus !");

				}

				else {
					System.out.println("Super le nombre etait bien : " + nb + " vous avez trouver la reponse en " + count + " essais");
					verif=false;
				}
			}
			else  {
				System.out.println("votre nombre est trop grand il faut choisir Entre O et 1000");

			}

		}
		sc.close();
	}

}

