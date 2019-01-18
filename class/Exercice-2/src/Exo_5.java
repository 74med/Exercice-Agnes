
public class Exo_5 {

	public static void main(String[] args) {

		/*		Écrire un programme permettant de remplir un tableau de 5 éléments, ensuite calcule et
				affiche la somme des éléments de ce tableau.*/

		int[] tab = {5,10,15,20,25};
		int sum = 0;
		for (int i = 0; i < tab.length; i++) {
			sum += tab[i];
			System.out.println(sum);	
		}
	}
}
