package lockMeAppCode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;

public class UserDataHandling {
	public static Scanner scanner = new Scanner(System.in);
	public static String fileName = LoginUser.userName;
	public static String siteName;
	public static String userId;
	public static String password;
	public static String option;
	public static void userDataHandling(String[] args) {
		
		
		
	while(true) {	
		System.out.println("----------------------------------");
		
		  System.out.println("To View Data press 1 : To Add Data Press 2 : To Delete All Data Press 3 : To Logout Press 4 :");
		
		 option = scanner.nextLine();
		
		switch (option) {
		
		case "1" :
			fetchUserData(args);
		break;
		case "2" :
			storeUserData(args);
		break;
		case "3" :
			deleteData(args);
			break;
		case "4" :
			HomePage.homePage(args);
			break;
			default :
			 System.out.println("Invalid Option : Try Again :");
		}
		if (option.equals("1") && option.equals("2") && option.equals("3") && option.equals("4")) {
		break;
	}
	}
	}

	public static void storeUserData(String[] args) {
		System.out.println("Enter Website Name : ");
		siteName = scanner.nextLine();
		System.out.println("Enter User Id : ");
		userId = scanner.nextLine();
		System.out.println("Enter Password : ");
		password = scanner.nextLine();
		
		
		String perSite = "Website Name : "+ siteName + System.lineSeparator() +
						 "User Id : " + userId + System.lineSeparator() +
						 "Password : " + password +System.lineSeparator() +
						 "----------------------------------------------------------";
		
		FileWriter out;
		try {
			out = new FileWriter(fileName, true);
			BufferedWriter buffer = new BufferedWriter(out);
			
			buffer.write(perSite);
			buffer.newLine();
			buffer.close();
			out.close();
		} catch (IOException e) {
			System.out.println("Error Occured");
			e.printStackTrace();
		}
		
		System.out.println("--------------------------------------------");
		System.out.println("Credentials Stored : ");

	}
	
	public static void fetchUserData(String[] args) {
		try {
			FileReader readFr = new FileReader(fileName);
			BufferedReader readBr = new BufferedReader(readFr);
			String fileData  ;
			while ((fileData = readBr.readLine()) != null ) {
				System.out.println(fileData);
			}
			readBr.close();
			readFr.close();
		} catch (FileNotFoundException e) {
			System.out.println("Empty : ");
		} catch (IOException e) {
			System.out.println("Empty : ");
		}
		
		userDataHandling(args);
	}

	public static void deleteData(String[] args) {
		
		
		File deleteFile = new File(fileName);
		deleteFile.delete();
		
		
		System.out.println("User Data Deleted");
		
		
	}

}

