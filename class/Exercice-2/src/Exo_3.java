import java.util.Scanner;

public class Exo_3 {

	/*
	Écrire une fonction permettant de calculer le factoriel d’un entier saisi au clavier.
	Sachant que :
	N ! = N * (N – 1) !
	1! = 0! = 1
	Exemple d’exécution :
	Donnez la valeur de n :
	5
	Le factoriel de 5 est :120
	 */
	public int CalculeFactorielle (int n)
	{
		// PRECONDITION : Le nombre entré est un nombre entier (un int), pas de nombre à virgules
		// Le nombre entré est un nombre entier positif (pas de nombre négatif )
		// Invariant : 0!=1
		// (x+1)!=(x+1)*x! (x est un Naturel.)

		int fact = 1;
		for (int i=1; i<=n; i++) 
		{
			fact = fact * i;
		}		
		return fact;	
	}

	// POSTCONDITION : Le résultat est affiché


	public static void main (String [] args)
	{	
		System.out.println("donner un entier :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();	
		Exo_3 objetFact = new Exo_3 ();
		System.out.println("le factorielle de "+n+" est : "+objetFact.CalculeFactorielle(n));
		sc.close();
	}	
}


/*	Scanner sc = new Scanner(System.in);

		System.out.println("Veuillez entrer un nombre ");
		int a = Integer.parseInt(args[0]);
		int n = sc.nextInt();
		for(int i = a; i >= 1; i--){
			n = n*i;
		}
		System.out.println(n);
		sc.close();
	}
}*/
