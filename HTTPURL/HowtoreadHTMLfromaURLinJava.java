how to read HTML from a URL in Java
import java.io.*
// this import is nessisary for getting the application to talk to a URL
import java.net.*
import java.util.Scanner;

public class getURL {
	public static void main (String[])
	{

		URL u;
		Scanner s;


		// set up a URL to be HHTP on local host
		u = new URL("http://localhost"); 
        
        //open a stream
        //point stream at you
    	s = new Scanner(u.openSteam());

    	//read from the stream one line at a time. 
    	while (s.hasNext())
    	{
    		System.out.println(s.nextLine());
    	}

		//if we run the program, we will find that the source code of the particular URL will get printed out. 
    }
}


