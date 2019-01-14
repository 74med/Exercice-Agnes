
public class Exo1_5bis {

	public static void main(String[] args) {

		boolean verif = true;
		int i = 1;
		while (verif) {

			int nb1 = (int) Math.floor(Math.random() * 1001);
			int nb2 = (int) Math.floor(Math.random() * 1001);
			int nb3 = (int) Math.floor(Math.random() * 1001);


			if (nb1%2 == 0 && nb2%2 == 0 && nb3%2 ==1) {
				System.out.println("le programme a tourner " + i + " fois avant de trouver les bonnes valeurs" );
				System.out.println(nb1 + " " + nb2 + " " + nb3);
				verif = false;
			}
			i++;
		}	
	}
}
