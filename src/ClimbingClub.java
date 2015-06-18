import java.util.ArrayList;


public class ClimbingClub {
	ArrayList <ClimbInfo> climbList = new ArrayList <ClimbInfo>();
	public ArrayList getClimbList(){
		return climbList;
	}
	
	public void addClimb(String peakName, int climbTime){
		ClimbInfo cia = new ClimbInfo(peakName, climbTime);
		climbList.add(cia);
	}

}
