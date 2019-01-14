import java.util.Arrays;

public class ExoBonus1 {
	
	public static int tableau(int[] parametre)  {
		Arrays.sort(parametre);
		return parametre[parametre.length -1] ;
		
	}
	
	public static void main(String[] args) {
 
		int[] tab	= {2,3,6,8,10};
		System.out.println("le plus grand entier et egal " + tableau(tab));
		
		int[] tab2 = {4,6,7,5,32,23,45};
		System.out.println("le plus grand entier et egal " +tableau(tab2));
	}

}
