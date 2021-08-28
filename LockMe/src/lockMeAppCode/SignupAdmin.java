package lockMeAppCode;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SignupAdmin {
	public static Scanner scanner = new Scanner(System.in);
	
	
	
	public static String fileName = "SignupAdmin.txt";


	public static void createSignupFileAdmin (String[] args) {
		
		  File tempFile = new File(fileName);
		  
			
		  if(tempFile.exists()) { 
			  System.out.println(""); 
			  }else {
		 
  try { 
  FileOutputStream out = new FileOutputStream(fileName);
  out.close();
  
 } catch (FileNotFoundException e) { 
	   System.out.println("Error Occured"); }
  catch (IOException e) { 
	  System.out.println("Error Occured"); }
  
  }
  
  
  }
 
 
public static void signupAdmin (String[] args) {
	
	while (true) {
		System.out.println("Enter unique id : Press 0 To Exit :");
		String uniqueId = scanner.nextLine();
		 
		
	  if (uniqueId.equals("0")) { 
		  System.out.println("Thank you for using Lockme : ");
		  System.exit(0); 
		  break;
		  }
		 
		 if(uniqueId.equals("123123")) {
			break;
		}
	System.out.println("Incorrect Id : Try Again :");
		
		}
		System.out.println("Please enter your details to register : ");
	
	try {
		String userName;
		String password;
		String password2;
		
		while (true) {
			
		
		System.out.println("Enter Username");
		userName = scanner.nextLine();
		System.out.println("Enter Password");
		password = scanner.nextLine();
		System.out.println(" Re-Enter Password");
		password2 = scanner.nextLine();
		
		if (password.equals(password2)) {
			break;
		}
		System.out.println("Passwords Don't Match : Try Again :");
		}
		
		
		String uidPswd = userName+","+password;
		
		
		FileWriter out = new FileWriter(fileName, true);
		BufferedWriter buffer = new BufferedWriter(out);
		
		buffer.write(uidPswd);
		buffer.newLine();
		buffer.close();
		out.close();
	} catch (FileNotFoundException e) {
		System.out.println("Error Occured");
	} catch (IOException e) {
		System.out.println("Error Occured");
	}
	System.out.println("Registerd Successfully! ");
	
	
		LoginAdmin.loginAdmin(args);
	
	
	
	}
		
	}


