import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class MoviesRatingApp {
	 Scanner scan = new Scanner (System.in);
		public static void main(String[] args) {

			ArrayList<Movies> scifi = new ArrayList<Movies>();
			scifi.add(new Movies ("Star Treck",8, "Scifi"));
			
			ArrayList<Movies> action = new ArrayList<Movies>();
			action.add(new Movies ("Inception",10, "Action"));
			action.add(new Movies ("Star Wars",9, "Action"));
			
			ArrayList<Movies> animated = new ArrayList<Movies>();
			animated.add(new Movies ("Spirited Away",10, "Animated"));
			animated.add(new Movies ("One Piece",8, "Animated"));
			animated.add(new Movies ("Castle In the Sky",10, "Animated"));

			ArrayList<Movies> horror = new ArrayList<Movies>();
			horror.add(new Movies("MonsterInc",7, "Horror"));
			horror.add(new Movies ("United",1, "Horror"));
			
			ArrayList<Movies> drama = new ArrayList<Movies>();
			drama.add(new Movies("From 5 to 9",8, "Drama"));
			drama.add(new Movies("Game of Thrones",10, "Drama"));
			
			ArrayList<Movies> comedy = new ArrayList<Movies>();
			comedy.add(new Movies("This Is The End",8, "Comedy"));
			
		
			
			
			System.out.println("Welcome to RottenPotatoes");
			
			System.out.println("There is a total of 10 ROTTEN movies in this list");
			
			String choice = "y";
			Scanner scan = new Scanner (System.in);
			
			while(choice.equalsIgnoreCase("y")){
				System.out.println("What category are you interested in?(Animated, Comedy, Drama, Horror, Action)");
		                String category = scan.nextLine();
		                
		                switch (category) {
		                    case "Animated":
		                        //Collections.sort(animated);
		                        System.out.println(animated);
		                        break;
		                    case "Comedy":
		                        //Collections.sort(comedy);
		                        System.out.println(comedy);
		                        break;
		                    case "Action":
		                       // Collections.sort(Action);
		                        System.out.println(action);
		                        break;
		                    case "Horror":
		                        //Collections.sort(Horror);
		                        System.out.println(horror);
		                        break;    
		                }
		                System.out.println("Contine (Y/N)?");
		                 choice = scan.nextLine();
		               if (choice.equalsIgnoreCase("n")){
		                   System.out.println("Thank you, enjoy your film.");
		               }
			}
		}
}
		
