import java.util.Arrays;

public class Exo1_4bis {

	public static void main(String[] args) {

		String[] email = new String[ 10 ];	 
		int comptGmail=0, comptOutlook=0, comptFree=0, comptOrange=0 , comptSfr=0,  comptHotmail=0;

		email [ 0 ] =  "dede.gui@gmail.fr" ;
		email [ 1 ] =  "jiji@gmail.fr" ;
		email [ 2 ] =  "guigui@outlook.fr" ;
		email [ 3 ] =  "popy@outlook.fr" ;
		email [ 4 ] =  "mike@gmail.fr" ;
		email [ 5 ] =  "hall@gmail.fr" ;
		email [ 6 ] =  "yoyo@free.fr" ;
		email [ 7 ] =  "fifa@orange.fr" ;
		email [ 8 ] =  "bigi@sfr.fr" ;
		email [ 9 ] =  "pac@hotmail.com" ;

		String recherche;
		int position;
		recherche = "@";
		position = email.length;
		while (position < 0){
			System.out.println("chaîne trouvée à la position " + position);
			position = email.length;
		}
		System.out.println("fin de la recherche");



		Arrays.sort(email);
		for (int i=0; i<email.length; i++){	
			System.out.println(email[i] + "\t");
		}
		System.out.println(Arrays.binarySearch(email, '@'));

	}	
}


