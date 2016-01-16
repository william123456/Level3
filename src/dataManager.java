import java.util.ArrayList;

public class dataManager {
	ArrayList<String> aL;

	public dataManager() {
		aL = new ArrayList<String>();

	}

	public void setNames(String name) {
		aL.add(name);

	}

	public ArrayList<String> getNames() {
		return aL;

	}

	public boolean searchName(String searchedName) {
		if (aL.contains(searchedName) == true) {
			return true;
		}

		else {
			return false;
		}

	}

}
