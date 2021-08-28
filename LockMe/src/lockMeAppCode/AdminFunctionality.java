package lockMeAppCode;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class AdminFunctionality {
	public static Scanner scanner = new Scanner (System.in);
	public static String username;
	public static String password;
	public static String option;
	public static String option2;
	

	public static void adminFunctionality(String[] args) {
		
while(true) {
	System.out.println("--------------------------------------------------");
	System.out.println("Press 1 to view all users : Press 2 to logout : ");
	option = scanner.nextLine();
	
			
			
		 if (option.equals("1"))	{		
			 checkAllUsers(args);
			 
		 }		 
		 else if (option.equals("2")) {
			 HomePage.homePage(args);
		 }
		 else {
			 System.out.println("Invalid Option : Try Again :");
}
		 if (option.equals("1") || option.equals("2")) {
			 
		 break;
		
	 }
		
	
	 }
	}

		

		
		
	
	public static void checkAllUsers(String[] args) {
		File text = new File("SignupUser.txt");
		 List<String> userList = new ArrayList<String>();
		 try {
			scanner = new Scanner(text);
		} catch (FileNotFoundException e) {
			System.out.println("Error Occured : ");
		}
		 
		 scanner.useDelimiter("[,\n]");
		 System.out.println("List Of Current Users : ");
			System.out.println("----------------------------------------------------");
			System.out.println("----------------------------------------------------");
		 
		 while (scanner.hasNext())
			{
				username = scanner.next();
				password = scanner.next();
				
				
				userList.add(username);
				
			}
		 Collections.sort(userList);

		 int index = 1;
		    for (String s : userList) {
		      System.out.println("User : " +String.valueOf(index ++)+"  : " + s);

		    }
		    
		  //*********************************************************

		    while(true) {
		    		System.out.println("--------------------------------------------------");
		    		System.out.println("Press 1 re-view user list : Press 2 to exit : ");
		    		Scanner sc = new Scanner(System.in);
		    		option2 = sc.nextLine();
		    		switch (option2) {
		    		
		    		case "1" :
		    			checkAllUsers(args);
		    			 break;
		    		case "2" :
		    			System.out.println("See You Soon :)  : ");
		    			System.exit(0);
		    			break;
		    		default :
		    			 System.out.println("Invalid Option : Try Again :");
		    }
		    		 if (option2.equals("1") || option2.equals("2")) {
		    			 
		    			 break;
		    			
		    		 }
		    		
		    
		    }

		    //*********************************************************************
		   
	}
}


