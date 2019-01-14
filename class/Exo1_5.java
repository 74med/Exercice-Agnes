
public class Exo1_5 {

	/**Exercice 5
Générer trois nombres aléatoires compris entre 0 et 1000, puis vérifier si vous avez deux
nombres pairs suivis par un nombre impair. Si ce n’est pas le cas, recommencer jusqu’à
ce vous ayez la combinaison pair, pair, impair. Afficher ensuite le nombre d’essais
nécessaires pour obtenir cette combinaison.
Indice : la classe Math propose la méthode statique floor qui génère un nombre
aléatoire compris entre 0 et 1.
Exemple : double nb=Math.floor();
	 */

	public static void main(String[] args) {

		boolean verif = true;
		while (verif) {


			// 1 ici on declare les nombres random compris entre O et 1000

			int nb1 = (int) Math.floor(Math.random() * 1001);
			//System.out.println(nb1);
			int nb2 = (int) Math.floor(Math.random() * 1001);
			//System.out.println(nb2);
			int nb3 = (int) Math.floor(Math.random() * 1001);
			//System.out.println(nb3);



			//System.out.println(nb1 + "\n" + nb2 + "\n" + nb3); Afin d'eviter de faire 3 syso 	

			//System.out.println(); // permet de sauter une ligne


			// 2 On transforme en string les valeur nb1 nb2 nb3		

			String nb1s = String.valueOf(nb1);
			String nb2s = String.valueOf(nb2);
			String nb3s = String.valueOf(nb3);
			//		System.out.println(nb1s + "\n" + nb2s + "\n" + nb3s);

			// 3 Ici on recupere uniquement le dernier chiffre 	

			//System.out.println(nb1s.substring(nb1s.length()-1));


			// 4 		
			boolean verif1;
			switch (nb1s.substring(nb1s.length()-1)) {

			case "0": case "2": case "4": case "6": case "8": verif1 = true;
			break;
			default: verif1 = false;
			}

			//if (nb1s.substring(nb1s.length()-1) == "0");

			boolean verif2;
			switch (nb2s.substring(nb2s.length()-1)) {

			case "0": case "2": case "4": case "6": case "8": verif2 = true; 
			break;
			default: verif2 = false;
			}

			boolean verif3;
			switch (nb3s.substring(nb3s.length()-1)) {

			case "0": case "2": case "4": case "6": case "8": verif3 = true; 
			break;
			default: verif3 = false;
			}

			if (verif1 == true && verif2 == true && verif3 == false) {
				System.out.println(nb1 + " " + nb2 + " " + nb3);
				verif = false;
			}
		}
	}

}
