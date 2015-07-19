import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.Normalizer;
import java.util.*;
import java.util.regex.Pattern;

public class TweetToquenizer {

	public void readFileIntoArrayList() throws IOException {
		FileReader twitterFile = null;
		String line = null;
		try {
			twitterFile = new FileReader(
					"..//DateTime/src/TwitterData/BasicTwitter.txt");
			BufferedReader br = new BufferedReader(twitterFile);
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
			twitterFile.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/*
	 * try { scanner = new Scanner(twitterFile); } catch (FileNotFoundException
	 * e) { // TODO Auto-generated catch block e.printStackTrace(); }
	 * ArrayList<String> list = new ArrayList<String>(); while
	 * (scanner.hasNextLine()) { System.out.println(scanner.hasNext()); String
	 * english = deAccent(scanner.nextLine()); System.out.println(english);
	 * list.add(english); } scanner.close(); return list; }
	 * 
	 * public String deAccent(String str) { String nfdNormalizedString =
	 * Normalizer.normalize(str, Normalizer.Form.NFD); Pattern pattern =
	 * Pattern.compile("\\p{InCombiningDiacriticalMarks}+"); return
	 * pattern.matcher(nfdNormalizedString).replaceAll(""); }
	 */
}
