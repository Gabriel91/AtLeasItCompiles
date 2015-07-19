import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//"{\"johnny is a great guy\":\"tweet1\",\"billy is a bad boy\":\"tweet2\"} "

public class TweetToquenizer {

	public String readFileIntoArrayList(int tweetNumber, BufferedReader br)
			throws IOException {

		String jsonObj = "{";
		if (tweetNumber != 1 && ((tweetNumber & 1) == 0)) {
//			jsonObj += ",";
		} else {
			jsonObj += "}, {";
		}
		jsonObj += '"' + br.readLine() + '"' + ":" + '"' + "tweet"
				+ tweetNumber + '"';
		jsonObj += "}";
		System.out.println(jsonObj);
		return jsonObj;
	}
}
