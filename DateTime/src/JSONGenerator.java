import java.io.IOException;
import java.util.ArrayList;

public class JSONGenerator {

	public static void main(String[] args) {
		ArrayList<String> twitList = new ArrayList<String>();
		TweetToquenizer toquenizer = new TweetToquenizer();
//		twitList = 
		try {
			toquenizer.readFileIntoArrayList();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		System.out.println(twitList.toString());
	}

}