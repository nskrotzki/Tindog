

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import java.sql.*;

public class TinDogMain
{
	private static ActionListener nuca_listener;
	private ActionListener login_listener;
	public static void main(String[] args)
	{

		//ArrayList<Dog> DogQueue = new ArrayList<Dog>();

		//Does this work?
<<<<<<< HEAD
	/*	JFrame frame1 = new FilterFrame();
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.setVisible(true);*/
		
=======
		JFrame frameStartFrame = new StartFrame();
		frameStartFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameStartFrame.setVisible(true);
>>>>>>> origin/master
		/*JFrame frame2 = new loginFrame();
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.setVisible(true);*/
		
		UniversalDogDB dogdb = new UniversalDogDB();
		try{
			dogdb.connect("select DOG_Name from Dog");
			ResultSet test = dogdb.getResultSet();
		 while(test.next()) // Retrieve data from ResultSet
         {
             System.out.print("Dog Name : "+test.getString(1)); //1st column of Table from database

         }	
		}catch (Exception e){
			System.out.println(e);
		}
		
		
		
		
	}
}
