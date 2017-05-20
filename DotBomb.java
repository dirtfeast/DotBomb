import java.util.*;

public class DotBomb {
    
    public void main(String args[]){

    // Instantiate GameHelper object
    GameHelper helper = new GameHelper();


    // Start tracking number of guesses
    int numOfGuesses = 0;

    void setUpGame(); {
    // create three DotComt objects
        DotCom dotcom0 = new DotCom();
        DotCom dotcom1 = new DotCom();
        DotCom dotcom2 = new DotCom();
        
    // Give each DotCom a name (set instance variable)
        dotcom0.name = "Pets.com";
        dotcom1.name = "Ask.com"
        dotcom2.name = "Go2.com"

    // Add names to ArrayList
        ArrayList<String> dotComsList = new ArrayList<String>();
        dotComsList.add(dotcom0.name);
        dotComsList.add(dotcom1.name);
        dotComsList.add(dotcom2.name);

    // Call for random locations for each DotCom
        helper.placeDotCom();
    // Assign results of placeDotComt() to location for each DotCom
    // something like dotcom0.locations = int array[]
        
    // -- display brief instructions to user
    }
    
    void startPlaying(); {
    // repeat while any locations remain
        while (any locations left) {
            // -- get user input guess
            // -- evaluate guess via checkUserGuess()
            
        }
    
    void checkUserGuess(); {
    // increment tally of guesses
            numOfGuesses++;
    // Declare local String to hold result, assuming "miss"
            String result = "Miss";
    // -- call each DotCom object via its checkYourself() method
    // -- check against its locations, remove upon hit/kill
    // -- display result to user
    // -- repeat (get input, check against elements) until zero elements left
    // -- then call finishGame()
    }

    void finishGame(); {
        System.out.println("Game Over!");
    // Tabulate score
    // Print quality ratint
    
    }
    
    
    
} // Close class DotBomb