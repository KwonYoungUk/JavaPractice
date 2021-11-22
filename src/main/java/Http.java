import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Http {
	public static void main(String[] args) throws IOException{
		int res = getTopicCount("pizza");
    }
	
	static int getTopicCount(String topic) throws MalformedURLException {
		HttpURLConnection connection = null;
		String targetURL = "https://en.wikipedia.org/w/api.php?action=parse&section=0&prop=text&format=json&page=[topic]";
		targetURL = targetURL.replace("[topic]", topic);
		int result = 0;
		
		try {
			URL url = new URL(targetURL);
			connection = (HttpURLConnection) url.openConnection();

		    InputStream is = connection.getInputStream();
		    BufferedReader rd = new BufferedReader(new InputStreamReader(is));
		    StringBuilder response = new StringBuilder(); // or StringBuffer if Java version 5+
		    String line;
		    while ((line = rd.readLine()) != null) {
		      response.append(line);
		      response.append('\r');
		    }
		    rd.close();

			Pattern pattern = Pattern.compile(topic);
			Matcher countMatcher = pattern.matcher(response);

			while (countMatcher.find()) {
				result++;
			}
			
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		} finally {
			if (connection != null) {
				connection.disconnect();	
			}
		}
    }
}
