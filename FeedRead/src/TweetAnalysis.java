

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TweetAnalysis
 */
@WebServlet("/TweetAnalysis")
public class TweetAnalysis extends HttpServlet {
	private static final long serialVersionUID = 1L;
	final static String POSITIVE = "positive\t";
	final static String NEGATIVE = "negative\t";
	final static String NEUTRAL = "neutral\"";
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TweetAnalysis() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		//if (request.getParameter("basic-addon2") != null) 
		{
				 try {
					 System.out.println("In post");
					 System.out.println("g"+request.getParameter("searchKey"));
				keyWordSearch(request.getParameter("searchKey"),request,response);
				 request.setAttribute("TC", "Hellllooooo");
				 
					request.getRequestDispatcher("index.html").forward(request,response);
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
		 
		}

	}
	public static void keyWordSearch(String subject,HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
		subject = subject.trim().toLowerCase();
		int positives = 0;
		int negatives = 0;
		int neutrals = 0;

		FileReader analyzedTweets = new FileReader(
				"C:/Users/BabithaReddy/workspace/FeedRead/src/TwitterData/TweetsAndAnalysis.txt");
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
		request.setAttribute("TC", "positives: " + positives + "\nnegatives: " + negatives + "\nneutral: " + neutrals + "   match: " + match);
		  try {
				request.getRequestDispatcher("index.jsp").forward(request,response);
				return;
			} catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		 
	}
	 	

}
