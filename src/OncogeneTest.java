//Copyright Wintriss Technical Schools 2014

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import org.junit.Test;

public class OncogeneTest
{
	@Test
	public void testOncogeneDetector()
	{
		OncogeneDetector oncogeneDetector = new OncogeneDetector();

		ArrayList<String> healthySequences = new ArrayList<String>();
		for (char c : "TGCATCC AAATTTGGGCCC ATGCGCTA GGGTACGGAG TTAATTGGG".toCharArray())
			healthySequences.add("" + c);

		ArrayList<String> cancerSequences = new ArrayList<String>();
		for (char c : "ATTTGCAGG TGCAAATTA AAAGGGCCCTTT TGCGATACGTAGGACCA ACTCATTAGTGC AAACGCTAGACACACAAG".toCharArray())
			cancerSequences.add("" + c); 

		assertTrue(oncogeneDetector.isOncogene(healthySequences, cancerSequences, "TGC"));
		assertFalse(oncogeneDetector.isOncogene(healthySequences, cancerSequences, "GGG"));
	}

}
