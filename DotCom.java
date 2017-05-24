import java.util.*;

public class DotCom {

    // ArrayList to hold cell locations
    private ArrayList<String> mLocationCells;
    
    // Add a name variable to hold names of dotcoms
    private String mName;

    // Settter
    // @param String ArrayList of locationcells
    public void setLocationCells(ArrayList<String> loc) {
        mLocationCells = loc;
    }

    // Setter
    // @param String of name
    public void setName(String n) {
        mName = n;
    }

    // @param String of user's location guess
    public String checkYourself(String userInput) {
        
        // Start with default result "miss"
        String result = "miss";
        
        // Determine element of user input
        int index = mLocationCells.indexOf(userInput);
        
        if (index >= 0) {
            mLocationCells.remove(index);
            
            if (mLocationCells.isEmpty()) {
                result = "kill";
                System.out.println("Ouch! you sank " + mName + " :  ( ");
                } else { result = "hit"; }
                    
        } // Close if

        // Return miss, kill, or hit
        return result;
        
    } // Close method checkYourself()

} // Close class DotCom