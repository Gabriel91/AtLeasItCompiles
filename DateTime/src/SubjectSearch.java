import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SubjectSearch {
	final static String POSITIVE = "positive\t";
	final static String NEGATIVE = "negative\t";
	final static String NEUTRAL = "neutral\"";

	public static void main(String[] args) throws IOException {
		int positives = 0;
		int negatives = 0;
		int neutrals = 0;

		FileReader analyzedTweets = new FileReader(
				"..//DateTime/src/TwitterData/TweetsAndAnalysis.txt");
		String line = null;
		String subject = "soda";//args[0].toLowerCase();

		BufferedReader br = new BufferedReader(analyzedTweets);
		int match = 0;
		while ((line = br.readLine()) != null) {
			line = line.toLowerCase();
			int index = -1;
			if ((index = line.indexOf(subject)) != -1) {
				match++;
				do {
					line = line.toLowerCase();
					if (line.contains(POSITIVE)){
						positives++;
						break;
					}
					else if (line.contains(NEGATIVE)){
						negatives++;
						break;
					}
					else if (line.contains(NEUTRAL)) {
						neutrals++;
						break;
					}
				} while ((line = br.readLine()) != null);
			}
		}
		analyzedTweets.close();
		System.out.println("positives: " + positives + "\nnegatives: " + negatives + "\nneutral: " + neutrals + "   match: " + match);
	}

}
