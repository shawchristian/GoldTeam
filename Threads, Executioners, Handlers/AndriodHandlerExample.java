//Andriod Handler Text
package com.javacodegeeks.andriod.andriodhandlerexample;

import andriod.app.Activity
import andriod.os.Bundle;
import andriod.os.Handler;
import andriod.view.View;
import andriod.widget.ProgressBar;

public class MainActivily extends Activity
{
	private Handler handler;
	private ProgressBar progressBar;

	public void onCreate(Bundle saved InstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		handler = new Handler();
		progressBar = (ProgressBar) findViewById(R.id.progressBar1);
	}

	public void startProgress(View view) 
	{
		new Thread(new Task()).start();
	}

	class Task implements Runnable
	{
		public void run()
		{
			public void run()
			{
				for (int 1 = 0; i <= 20; i++)
				{
					final int value = i;
					try
					{
						Thread.sleep(1000);
					}
					catch (InterruptedException e)
					{
						e.printStackTrace();
					}
					handler.post(new Runnable()
					{
						public void run()
						{
							progressBar.setProgress(value);
						}
					});
				}
			}
		}
	}
}