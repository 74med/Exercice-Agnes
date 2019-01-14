
public class Exo1_3_1 {

	public static void affichage (int tab [][]) {

		for (int i=0; i< tab.length; i++){
			for (int j=0; j<tab[i].length; j++) {
				System.out.print(tab[i][j] + " ");
			}
			System.out.println(" ");
		}


	}

	public static void main(String[] args) {

		int tab1 [] [] = {	{2,4,5},{3,33,32}	};
		affichage(tab1);
		int tab2 [] [] = {	{3},{3,4,5},{3,5},{3,1,0}	};
		affichage(tab2);

	}

}
