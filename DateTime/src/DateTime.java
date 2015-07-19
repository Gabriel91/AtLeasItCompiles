import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;

public class DateTime {
	private final static String USER_AGENT = "Mozilla/5.0";

	public static void main(String[] args) {
		TweetToquenizer toquenizer = new TweetToquenizer();
		try {
			FileReader twitterFile = null;
			String resultLine = null;
			String line = null;
			int tweetNumber = 2; //gotta start at 2 cause of an if conditional tweettoquenizer class
			String url = "http://sentiment.vivekn.com/api/batch/";

			HttpClient client = new DefaultHttpClient();
			HttpPost post = new HttpPost(url);

			// add header
			post.setHeader("User-Agent", USER_AGENT);
			// "{\"johnny is a great guy\":\"tweet1\",\"billy is a bad boy\":\"tweet2\"} "
			twitterFile = new FileReader(
					"..//DateTime/src/TwitterData/BasicTwitter.txt");
			BufferedReader br = new BufferedReader(twitterFile);

			while ((line = br.readLine()) != null) {
				StringEntity params = new StringEntity(
						toquenizer.readFileIntoArrayList(tweetNumber, br));
				post.addHeader("batch", "");

				post.setEntity(params);

				HttpResponse response = client.execute(post);

				BufferedReader rd = new BufferedReader(new InputStreamReader(
						response.getEntity().getContent()));

				StringBuffer result = new StringBuffer();
				while ((resultLine = rd.readLine()) != null) {
					result.append(resultLine);
				}

				System.out.println(result.toString());
			}
			twitterFile.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}

	}

}
