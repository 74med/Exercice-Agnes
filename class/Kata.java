import java.util.Scanner;

public class Kata {
	public static void expandedFirstForm(int result) {

		/**
		 * Rédigez une fonction expandedFirstForm qui développe un nombre en un produit de facteurs premiers.
		 * 
		   Exemple :

		   expandedFirstForm(12); // Should return '2*2*3'
		   expandedFirstForm(42); // Should return '2*3*7'
		   expandedFirstForm(240); // Should return '2*2*2*2*3*5'
		 * 
		 */


		int facteur ; 
		String test = "";


		for (int i = 2; i <=result; i++) {


			if(result%i==0) {
				result/= i;
				facteur = i;
				i= 1;
				test  += facteur  + "*";


			} 
		}

		System.out.print(test.substring(0,test.length() -1));

	}

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in); // recuperer saisie 
		int num1 = num.nextInt();
		expandedFirstForm(num1);	

		num.close();   
	}

}
