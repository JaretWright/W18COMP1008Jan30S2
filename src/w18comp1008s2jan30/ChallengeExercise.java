
package w18comp1008s2jan30;

import java.util.ArrayList;

/**
 *
 * @author JWright
 */
public class ChallengeExercise {
    
    public static void main(String[] args)
    {
        ArrayList<String> favGames = new ArrayList<>();
        favGames.add("Portal");    
        favGames.add("Quake 3 Arena");
        favGames.add("Dark Souls");
        
        System.out.printf("My favourite games are: %s%n",favGames);
        
        for(String nameOfGame : favGames)
            System.out.println(nameOfGame);
    }
    
}
