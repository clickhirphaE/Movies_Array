import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class MoviesArraylists {
public static void main(String args[]){
    String movies_name="";
    Scanner inp=new Scanner(System.in);
    Random rr=new Random();
    ArrayList<String> List=new ArrayList<String>();
    do {
        //wo-While loop starts here
        System.out.println("PLEASE ENTER THE NAME OF YOUR MOVIES");
        movies_name = inp.nextLine();
        if (movies_name.equalsIgnoreCase("q")) {
            continue;
        }
        List.add(movies_name);   //Adding list of movies to an Array
    } while(!movies_name.equalsIgnoreCase("Q")); //do-While loop Ends here
      Collections.sort(List);  //This method sorts the Movies ArrayList
            System.out.println("THE MOVIES NAME YOU INSERTED ABOVE ARE:"+List);
            int random_movies=rr.nextInt(List.size());
    System.out.println("\nWe recommend you watching this Movies:"+List.get(random_movies)+" Movie");
         }
         }

