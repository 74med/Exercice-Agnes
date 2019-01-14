import java.util.Scanner;

public class Exo1_2 {

	public static void main(String[] args) {


		Scanner reader = new Scanner(System.in);
		String name, lastname;

		System.out.println(" Veuillez entrer votre name s'il vous plait ");
		name = reader.nextLine();

		System.out.println(" veuillez entrer votre lastname ");
		lastname = reader.nextLine();

		lastname = lastname.toUpperCase();
		

		name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();// plus generaliser
		// lastname = Character.toUpperCase (lastname.charAt(0)) + lastname.substring(1); pour changer la premiere lettre uniquement 
		System.out.println(lastname + " " + name);

		reader.close();

	}

}
