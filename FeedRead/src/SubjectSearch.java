import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class SubjectSearch {
	final static String POSITIVE = "positive\t";
	final static String NEGATIVE = "negative\t";
	final static String NEUTRAL = "neutral\"";
	
	public static void main(String[] args) throws IOException
	{
		String inputString = "";
		for (int i = 0; i < args.length;i++)
		{
			inputString += args[i];
		}
		keyWordSearch(inputString);
	}

	public static String keyWordSearch(String subject) throws IOException {
		subject = subject.trim().toLowerCase();
		int positives = 0;
		int negatives = 0;
		int neutrals = 0;

		FileReader analyzedTweets = new FileReader(
				"..//FeedRead/src/TwitterData/TweetsAndAnalysis.txt");
		String line = null;

		BufferedReader br = new BufferedReader(analyzedTweets);
		int match = 0;
		while ((line = br.readLine()) != null) {
			line = line.trim().toLowerCase();
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
		String results = positives + "," + negatives + "," + neutrals;
		return results;
	}

}
