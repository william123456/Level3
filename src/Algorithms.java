import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		return eggs.indexOf("cracked");

	}

	public static int countPearls(List<Boolean> oysters) {
		int numOfPearls = 0;
		for (Boolean b : oysters) {
			if (b.booleanValue()) {
				numOfPearls++;

			}

		}
		return numOfPearls;
	}

	public static double findTallest(List<Double> peeps) {
		double biggestHeight = 0;
		for (Double d : peeps) {
			if (d > biggestHeight) {
				biggestHeight = d;
			}
		}
		return biggestHeight;
	}

	public static String findLongestWord(List<String> words) {
		String longestWord = "";
		for (String s : words) {
			if (s.length() > longestWord.length()) {
				longestWord = s;
			}

		}
		return longestWord;
	}

	public static boolean containsSOS(List<String> message1) {
		boolean hasSOSMessage = false;
		for (String s : message1) {
			if (s.equals(" ... --- ... ")) {
				hasSOSMessage = true;

				break;
			}

		}

		return hasSOSMessage;
	}

	public static List<Double> sortScores(List<Double> originalList) {
		Collections.sort(originalList);
		return originalList;
	}

	public static List<String> sortDNA(List<String> lBS) {
		ArrayList<Integer> sortThisList = new ArrayList<Integer>();
		// for(String s: lBS){
		// sortThisList.add(s.length());
		// }
Collections.sort(lBS);
		return lBS;
	}
	// if(d < originalList.get(originalList.indexOf(d - 1)));

}
