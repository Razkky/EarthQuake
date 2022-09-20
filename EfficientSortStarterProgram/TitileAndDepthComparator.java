import java.util.*;
import edu.duke.*;
/**
 * Write a description of TitileAndDepthComparator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitileAndDepthComparator implements Comparator<QuakeEntry> {
    public int compare(QuakeEntry q1, QuakeEntry q2){
        int i = q1.getInfo().compareTo(q2.getInfo());
        if(i != 0){
            return i;
        }
        else{
            return Double.compare(q1.getDepth(), q2.getDepth());
           
        }
    }
}
