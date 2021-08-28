package lockMeAppCode;

import java.io.File;
import java.util.Scanner;

public class LoginAdmin {
	public static Scanner scanner = new Scanner(System.in);
	
	public static void loginAdmin(String[] args) {
		
		String userName;
		
		
		System.out.println("Please enter your details to login : ");
		System.out.println("--------------------------------------");
		
		while (true) {
		System.out.println("Enter Username");
		userName = scanner.nextLine();
		
		if (userName.equals("0")) {
			HomePage.homePage(args);
			break;
		}
		
		System.out.println("Enter Password");
		String password = scanner.nextLine();
		boolean found = false;
		String fileName = "SignupAdmin.txt";
		
		String tempUsername;
		String tempPassword;
		
		try {
			Scanner scanner = new Scanner(new File(fileName));
			scanner.useDelimiter("[,\n]");
			
			while (scanner.hasNext() && !found)
			{
				tempUsername = scanner.next();
				tempPassword = scanner.next();
				
				if (tempUsername.trim().equals(userName.trim()) && tempPassword.trim().equals(password.trim())) {
					found = true;
					
				}
			}
		
			
			
			if(found == true) {
				break;
			}
		System.out.println("invalid username or password : Ty again : Press 0 to return to the main menu : ");
		System.out.println("------------------------------");
		
			
		} catch (Exception e) {
			System.out.println("Error Occured : ");
		}
		}
		
		System.out.println("welcome : " + userName);
		AdminFunctionality.adminFunctionality(args);
	

}
}