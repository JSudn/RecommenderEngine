/***************************************************************************
 * Name: Sudhan Gurav
 *
 *  Date: Feb 24th, 2022
 *
 *  Description:  -------------------STEP Three--------
 *                Create a new public interface named Rater. Add methods to
 *                this new interface by copying all the method signatures
 *                from the PlainRater class.
 *
 ***************************************************************************/
import java.util.ArrayList;

public interface Rater {
    public void addRating(String item, double rating);
    
    public boolean hasRating(String item);
    
    public String getID();
    
    public double getRating(String item);
    
    public int numRatings();
    
    public ArrayList<String> getItemsRated();
}
