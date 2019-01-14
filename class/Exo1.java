package semaine5;


import java.util.Scanner;

public class Exo1 {


	public static void main(String[] args) {
	
	System.out.println(args[0]);
		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("veuillez saisir un nombre entier : "); // tache destiné a l'utilisateur
			byte nombre = sc.nextByte(); // enregistrement de la saisie faite par l'utilisateur

			System.out.print("veuillez saisir un deuxiemes nombre entier : ");

			byte nombre2 = sc.nextByte(); // enregistrement de la saisie faite par l'utilisateur

			System.out.print("\n Voici votre calcule " +nombre + " + " +nombre2 + " = " + (nombre + nombre2)); // reponse donné a ce meme utilisateur

		}

		catch (Exception e) {

			System.err.println(" désolé vous avez fait une erreur de saisie ");
		}

		sc.close();
	}

}





/*
		try {
			int nb1 = Integer.parseInt(args[0]);
			int nb2 = Integer.parseInt(args[1]);
			System.out.println(nb1 + " + " nb2 + " = " + (nb1+nb2));
		}catch (Exception e) {

			System.err.println(" désolé vous avez fait une erreur de saisie ");
		}

	}
}*/





