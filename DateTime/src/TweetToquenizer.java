import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class TweetToquenizer {

	public ArrayList<String> readFileIntoArrayList() {
		Scanner scanner = null;
		try {
			scanner = new Scanner(new File(
					"..//DateTime/src/TwitterData/BasicTwitter.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ArrayList<String> list = new ArrayList<String>();
		while (scanner.hasNextLine()) {
			list.add(scanner.nextLine());
		}
		scanner.close();
		return list;
	}
}
