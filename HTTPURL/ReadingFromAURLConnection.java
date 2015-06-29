//Reading from and writing to URLConnection

//many of these methodes are only useful when we are working with a URL connection
//the following program performs the same function as the URL reader

import java.net.*;
import java.io.*;

public class URLConnectionReader 
{
	public class URLConnectionReader
	{
		URL oracle = new URL("http://www.oracle.com/");
		URLConnection yc = oracle.openConnection();
		BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));

		String inputLine;
		while ((inputLine = in.readline()) != null)
			System.out.println(inputLine);
		in.close();
	}
}



