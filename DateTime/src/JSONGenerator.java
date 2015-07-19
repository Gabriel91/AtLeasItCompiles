import java.util.ArrayList;

public class JSONGenerator {

	public static void main(String[] args) {
		ArrayList<String> twitList = new ArrayList<String>();
		TweetToquenizer toquenizer = new TweetToquenizer();
		twitList = toquenizer.readFileIntoArrayList();
		
		System.out.println(twitList.toString());
	}

}
