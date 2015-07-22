//JFrame: The window
package com.edu4java.minitennis1;
import javax.swing.JFrame;

//creating the windows for the mini tennis game here.  However the
//window will not be availible until we cll setVisible(true)
public class Game
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Mini Tennis");
		//set the window size to be approximatly 300 pixles
		frame.setSize(300, 300);
		//this is what will be called in order to make the window that our program will run
		//in visible
		frame.setvisible(true);
		//this allows to the program to close once we actually close the window, instead of it
		//continuing to run after we close it.  
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}