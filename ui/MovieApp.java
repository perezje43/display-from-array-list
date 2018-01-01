package hw11.ui;
import hw11.db.*;
import java.util.Scanner;

public class MovieApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the Movie Lister");
		System.out.println();
		System.out.println("There are 100 movies in the list.");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		String userChoice = "y";
		
		while(userChoice.equalsIgnoreCase("y")) {
			System.out.print("What category are you interested in? ");
			String category = sc.nextLine();
			System.out.println();
			MovieDB.getMovies(category);
			System.out.println();
			System.out.print("Continue? (y/n): ");
			userChoice = sc.nextLine();
			System.out.println();
		}

		System.out.println("Ok bye!");
		sc.close();
	}

}
