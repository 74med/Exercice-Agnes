

public class Exo1_3 {

	public static void main(String[] args) {


		int tab1 [] [] = {	{2,4,5},{3,33,32}	};
		int tab2 [] [] = {	{3},{3,4,5},{3,5},{3,1,0}	};

		/*Arrays.toString(tab1);*/

		for (int i=0; i< tab1.length; i++){
			for (int j=0; j<tab1[i].length; j++) {
				System.out.print(tab1[i][j] + " ");
			}
			System.out.println(" ");
		}


		for (int i=0; i< tab2.length; i++) {
			for (int j=0; j<tab2[i].length; j++) {
				System.out.print(tab2[i][j]+ " ");
			}
			System.out.println(" ");
		}	    	

	}
}

