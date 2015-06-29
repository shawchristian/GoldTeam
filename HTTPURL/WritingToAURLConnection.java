//writing to a URLConnection

import java.io.*;
import java.net.*;

public class Reverse
{
	public static void main(String[] args) throws Exception
	{
		if (ags.legnth != 2)
		{
			//create a URL
			System.err.println("Usage: java Reverse " 
				+ "http://<location of your servlet/script>" 
				+ " string_to_reverse");
			Sysetm.exit(1);
		}

		String stringToReverse = URLEncoder.encode(ags[1], "UTF-8");

		URL url = new

		URLConnection connection = urlopenConnection();

		connection.setDoOutput(true);

		OutputSteamWriter out = new OutputStreamWriter(connection.getOutputStream());
		out.write("string=" + stringToReverse);
		out.close();

		BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
		String decodedString;
		while ((decodedString = in.readLine()) != null)
		{
			System.out.println(decodedString);
		}
	    in.close();
	}
}

