import java.util.ArrayList;

public class OncogeneDetector {

	public boolean isOncogene(ArrayList<String> healthySequences, ArrayList<String> cancerSequences, String suspectedOncogene) {
		int totalNumberOfSuspectedOncogenes = 0;
		int totalNumberOfChars = 0;
		for (String s : healthySequences) {
			if (s.contains(suspectedOncogene) == true) {
				totalNumberOfSuspectedOncogenes = totalNumberOfSuspectedOncogenes + suspectedOncogene.length();

			}
			totalNumberOfChars = totalNumberOfChars + 1;
		}
		int totalNumberOfSuspetectedOncogenesCancer = 0;
		int totalNumberOfCharsCancer = 0;
		for (String g : cancerSequences) {
			if (g.contains(suspectedOncogene) == true) {
				totalNumberOfSuspetectedOncogenesCancer = totalNumberOfSuspetectedOncogenesCancer + 1;

			}
			totalNumberOfCharsCancer = totalNumberOfCharsCancer + g.length();
		}
		// Calculating percentage
		int healthySuspectedOncogenePercentage = (totalNumberOfSuspectedOncogenes / totalNumberOfChars) * 100;
		int cancerSuspectedOncogenePercentage = (totalNumberOfSuspetectedOncogenesCancer / totalNumberOfCharsCancer) * 100;

		// Comparing percentages, final step
		if (cancerSuspectedOncogenePercentage > healthySuspectedOncogenePercentage) {
			return true;
		} else {
			return false;
		}
	}
}
