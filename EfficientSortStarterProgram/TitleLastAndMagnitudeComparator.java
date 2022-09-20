import java.util.*;
import edu.duke.*;
/**
 * Write a description of TitleLastAndMagnitudeComparator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
 public class TitleLastAndMagnitudeComparator implements Comparator<QuakeEntry> {
        public int compare(QuakeEntry q1, QuakeEntry q2){
            String a = q1.getInfo();
            String b = q2.getInfo();
            String aLast = a.substring(a.lastIndexOf(" ")+1);
            String bLast = b.substring(b.lastIndexOf(" ")+1);
            
            int i = aLast.compareTo(bLast);
            if(i ==0){
                return Double.compare(q1.getMagnitude(), q2.getMagnitude());
            }
            return i;
        }
}
