import java.util.Scanner;

public class Exo_2 {

	/*	Écrire un programme qui lit un entier au clavier et qui l’affiche verticalement comme dans
	cet exemple :
	Exemple d’exécution :
	Donnez un nombre entier : 785412
	7
	8
	5
	4
	1
	2*/

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Veuillez entrer un nombre ");
		String nombre = sc.nextLine();

		for (int i = 0; i < nombre.length(); i++) {
			System.out.println(nombre.charAt(i));		
		}
		System.out.println("Vous avez entrer " + nombre + " ");
		sc.close();
	}
	
}
