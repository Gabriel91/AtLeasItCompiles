import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//"{\"johnny is a great guy\":\"tweet1\",\"billy is a bad boy\":\"tweet2\"} "

public class TweetToquenizer {

	public String readFileIntoArrayList() throws IOException {
		FileReader twitterFile = null;
		String line = null;
		int tweetNumber = 1;
		String jsonObj = "{";
		try {
			twitterFile = new FileReader(
					"..//DateTime/src/TwitterData/BasicTwitter.txt");
			BufferedReader br = new BufferedReader(twitterFile);
			while ((line = br.readLine()) != null) {
//				System.out.println(line);
				if (tweetNumber != 1) {
					jsonObj += ",";
				}
				jsonObj += '"' + br.readLine() + '"' + ":" + '"' + "tweet" + tweetNumber + '"';
				tweetNumber++;
				
			}
			jsonObj += "}";
			System.out.println(jsonObj);
			twitterFile.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return jsonObj;
	}
}
