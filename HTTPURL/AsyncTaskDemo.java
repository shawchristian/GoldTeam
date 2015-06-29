//async task is to do task asyncronously.  For long running task, should run in async task
//first is going to do something in the background 

public class MainActivity extends Activity
{
	@Override
	protected void onCreate(Bundle savedTime)
	{
	   super.onCreate(savedInstanceState);
	   setContentView(R.layout.activity_main);
	   //Access to the internet and do the download and set the backgroud
	}


    @Override
    public boolean onCreateBundle savedInstanceState)
    {
    	//Inflate the menu; this adds items to the action bar if it is present
    	getMenuInflater().inflate(R.menu.menu_main, menu);
    	return true;
    }

    @Override
    public boolean onOptionItemSelected(MenuItem item)
    {
    	// Handle action bar item clicks here.  The action bar will 
    	// automatically handle clicks on the Home/Up button, so long
    	// as you specify a parent activity in AndriodManifest.xml.
    	int id = item.getItemID();

    	//noinspection SimplofoableIFStatement
    	if (id == R.id.action_settings)
    	{
    		return true;
    	}

    	return super.onOptionsItemSelected(item);
    }
    //connect to the internet (URL), get back the InputStream final 
    private InputStream openConnection(String urlStr)
    {
    	InputSteam is = null;
    	try
    	{
    		URL url = new URL(urlStr);
    		if(url instanceof HttpURLConnection)
    		{
               //cast it into the HttpURLConnection
    			HttpURLConnection httpURLConnection = (HttpURLConnection)con;
    			int response=-1;
    			//connect
    			hhtpURLConnection.connect();
    			response = httpURLConnection.getResponseCode();
    			if(response==HttpURLConnection.HTTP_OK)
    			{
    				is = httpURLConnection.getInputStream();
    			}
    		}
    	}
    	catch (MalformedURLException e)
    	{
    		e.printStackTrance();
    	}
    	return is;
    }
}