package lockMeAppCode;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SignupUser {
	public static Scanner scanner = new Scanner(System.in);
	public static String fileName = "SignupUser.txt";
	public static String userName;
	public static String password;
	public static String password2;
	
	public static void signupUser(String[] args) {
		
		System.out.println("Enter Username : ");
		
	userName = scanner.nextLine();
	
	 File tempFile = new File(userName);
	  
		
	  if(tempFile.exists()) { 
		  System.out.println("User Exists Please Try Again");
		  HomePage.homePage(args);
		  }else {
	 
try { 
FileOutputStream out = new FileOutputStream(userName);
out.close();

} catch (FileNotFoundException e) { 
  System.out.println("Error Occured"); }
catch (IOException e) { 
 System.out.println("Error Occured"); }

}
	  try {  
	  while (true) {
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
		
	  
	  
	LoginUser.loginUser(args);
		
	}
}

