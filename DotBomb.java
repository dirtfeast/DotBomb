import java.util.*;

public class DotBomb {

    // Instantiate GameHelper object
    private GameHelper helper = new GameHelper();

    // Declare ArrayList of DotCom objects
    private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();

    // Start tracking number of guesses
    private int numOfGuesses = 0;

    public void main(String args[]){

    private void setUpGame() {
    // create three DotComt objects
        DotCom dotcom0 = new DotCom();
        DotCom dotcom1 = new DotCom();
        DotCom dotcom2 = new DotCom();
        
    // Give each DotCom a name (set instance variable)
        dotcom0.name = "Pets.com";
        dotcom1.name = "eToys.com";
        dotcom2.name = "Go2.com";

    // Add DotCom objects to ArrayList
        dotComsList.add(dotcom0);
        dotComsList.add(dotcom1);
        dotComsList.add(dotcom2);

    // Display brief instructions to user
        System.out.println("Instructions");

    // Loop through each object in ArrayList
        for (DotCom dotComToSet : dotComsList) {

        // -- call to helper.placeDotCom for ArrayList<String> of 3 locations
        // Call for random locations for each DotCom
        // Assign results of placeDotCom() to location for each DotCom
            ArrayList<String> newLocation = helper.placeDotCom(3);
            dotComToSet.setLocationCells(newLocation);
        } // Close for
    } // Close method setUpGame()

    private void startPlaying() {
    // repeat while any locations remain
        while (!dotComsList.isEmpty()) {
            // -- get user input guess
            String userGuess = helper.getUserInput("Enter a guess");
            // -- evaluate guess via checkUserGuess()
            checkUserGuess(userGuess);
        } // Close while
        finishGame();
    } // Close method startPlaying()
    
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
    
    } // Close method finishGame()
    
    
    
} // Close class DotBomb