import java.util.Scanner;

public class Exo_4 {

	/*
		La suite de Fibonacci est définie par :
		f1 = 1,
		f2 = 1 et fn+2 = fn+1 + fn.
		Ecrire une fonction calculant le Nième élément de la suite.
		Exemple d’exécution :
		Donnez la valeur de n :
		5
		le 5ième élément de la suite est : 8
	 */


	public static int fibonacci(int saisieU) {

		int f1 = 0;
		int f2 = 1;
		int som = f1 + f2;

		for (int i = 1; i < saisieU; i++) {
			f1 = f2;
			f2 = som;
			som = f1+f2;			
		}
		return som;
	}

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		System.out.print("entrer un nombre ");
		int saisie = reader.nextInt();
		System.out.println("result " + fibonacci(saisie));

		reader.close();
	}

}
