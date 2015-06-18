
public class ClimbInfo
{
	String peakName;
	
	int climbTime;
 /** Creates a ClimbInfo object with name peakName and time climbTime.
 * @param peakName the name of the mountain peak
 * @param climbTime the number of minutes taken to complete the climb
 */
 public ClimbInfo(String peakName, int climbTime)
 { /* implementation not shown */
	 this.peakName = peakName;
	 this.climbTime = climbTime;
 }
 /** @return the name of the mountain peak
 */
 public String getName()
 { /* implementation not shown */ 
	return peakName;
	 
		
 }
 public void setTime(int newTime){
	 climbTime = newTime;
 }
 
 public void setName(String newName){
	 peakName = newName;
 }
 public int getTime()
 { /* implementation not shown */ 
	 return climbTime;
	 
 }
 // There may be instance variables, constructors, and methods that are not shown.
}
