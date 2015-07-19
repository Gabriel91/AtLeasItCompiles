

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;













import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.*;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;

public class DateTime {
	private final static String USER_AGENT = "Mozilla/5.0";
	 
	public static void main(String[] args)  {
 
		try {
			
			String url = "http://sentiment.vivekn.com/api/text/";
			 
			HttpClient client = new DefaultHttpClient();
			HttpPost post = new HttpPost(url);
	 
			// add header
			post.setHeader("User-Agent", USER_AGENT);
			List<NameValuePair> urlParameters = new ArrayList<NameValuePair>();

			   
			    urlParameters.add(new BasicNameValuePair("txt", "he is bad"));
			   
			    post.setEntity(new UrlEncodedFormEntity(urlParameters));
			    
				HttpResponse response = client.execute(post);
			
				BufferedReader rd = new BufferedReader(
                        new InputStreamReader(response.getEntity().getContent()));
 
		StringBuffer result = new StringBuffer();
		String line = "";
		while ((line = rd.readLine()) != null) {
			result.append(line);
		}
 
		System.out.println(result.toString());
			
		
			
			
 
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally
		{
			
			
			
		}
 
	}
 
}
