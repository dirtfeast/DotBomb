import java.util.*;

public class DotBomb {

    // Instantiate GameHelper object
    private GameHelper helper = new GameHelper();

    // Declare ArrayList of DotCom objects
    private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();

    // Start tracking number of guesses
    private int numOfGuesses = 0;

    public static void main(String[] args) {

    // Create game object - DotBomb
    DotBomb game = new DotBomb();
    
    // tell the game object to setupgame
    game.setUpGame();
    
    // tell the game object to startplaying
    game.startPlaying();

    } // Close method main()
    
    
    private void setUpGame() {
    // Instantiate three DotCom objects
        DotCom dotcom0 = new DotCom();
        DotCom dotcom1 = new DotCom();
        DotCom dotcom2 = new DotCom();
        
    // Give each DotCom a name (set instance variable)
        dotcom0.setName("Pets.com");
        dotcom1.setName("eToys.com");
        dotcom2.setName("Go2.com");

    // Add DotCom objects to ArrayList
        dotComsList.add(dotcom0);
        dotComsList.add(dotcom1);
        dotComsList.add(dotcom2);

    // Display brief instructions to user
        System.out.println("Instructions: ...");

    // Loop through each object in ArrayList
        for (DotCom dotComToSet : dotComsList) {

        // -- call to helper.placeDotCom for ArrayList<String> of 3 locations
            ArrayList<String> newLocation = helper.placeDotCom(3);

        // Call for random locations for each DotCom
        // Assign results of placeDotCom() to location for each DotCom
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

        // -- then call finishGame()
        finishGame();
    } // Close method startPlaying()
    
    private void checkUserGuess(String userGuess) {
    // increment tally of guesses
            numOfGuesses++;
    // Declare local String to hold result, assuming "miss"
            String result = "Miss";
    // -- call each DotCom object via its checkYourself() method

    for (int x = 0; x < dotComsList.size(); x++) {
    
        result = dotComsList.get(x).checkYourself(userGuess);

    // -- check against its locations, remove upon hit/kill
        
        if (result.equals("hit")) { break; }
        
        if (result.equals("kill")) {
            dotComsList.remove(x);
            break; }
    } // Close for

    // -- display result to user
    System.out.println(result);
    
    // -- repeat (get input, check against elements) until zero elements left
    } // Close method checkUserGuess()

    private void finishGame() {
        System.out.println("Game Over!" + numOfGuesses + "guesses");
    // Tabulate score
    // Print quality ratint
    
    } // Close method finishGame()
    
    
    
} // Close class DotBomb