import java.util.ArrayList;


public class LearningArrayLists {
	
	static String lal;

	public static ArrayList createArrayList() {
		return new ArrayList <String> ();
		
		
	}

	public static void addToArrayList(ArrayList testList, String string) {
		String t1 = new String();
		
		testList.add(t1);
	}

	public static Object getNumberOfItems(ArrayList testList) {
		
		return testList.size();
	}

	public static String getItem(ArrayList testList, int i) {
		
				return (String) testList.get(i);
	}

	public static String iterateOver(ArrayList testList) {
	      String thing = new String();
		for(int i = 0; i<testList.size(); i++){
			
			
			thing += (testList.get(i));
			//thing.add(testList.get(i));
			 
	
		}
		
		return thing;
	}
	
	public static int findItemOnList(ArrayList testList, String variableGetter){
		
		System.out.println(testList.indexOf(variableGetter));
		
		return testList.indexOf(variableGetter); 
		
		
	}
	
	public static void replaceItem(ArrayList testList, int numOfVariableToChange, String variableName){
		
		testList.set(numOfVariableToChange, variableName);
		
	}
	
	public static void insertItem(ArrayList testList, int insertLocation, String variableName){
		
		testList.add(insertLocation, variableName);
		
	}
	
public static ArrayList createTypedArrayList(){
	return new ArrayList <Integer>  ();
}

public static Integer addAllInteger(ArrayList <Integer> testList){
	int holder = 0;
	for(Integer i: testList){
	holder += i;
	 
	}
	System.out.println(new Integer(holder).toString());
	
	return new Integer(holder);
}

public static ArrayList createStringTypedArrayList(){
	return new ArrayList <String>  ();
}

public static String addAllString(ArrayList <String> testList){
      String holder = "";
	for(String s: testList){
	holder = holder.concat(s);
	 System.out.println(holder);
	}	
	return holder;
}

}
