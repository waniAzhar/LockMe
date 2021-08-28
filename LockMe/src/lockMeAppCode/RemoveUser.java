package lockMeAppCode;


import java.io.BufferedWriter;
import java.io.File;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class RemoveUser {
	public static Scanner scanner = new Scanner(System.in);

	public static void removeUser(String[] args) {
		String filePath = "SignupUser.txt";
		
		String removeTerm = scanner.nextLine();
		
		
		removeRecord(filePath,removeTerm);
		
		

	}

	private static void removeRecord(String filePath, String removeTerm) {
		
		String tempFile = "temp.txt";
		File oldFile = new File(filePath);
		File newFile = new File(tempFile);
		String userName = "" ; String password = "";
		
		
		try {
			FileWriter fw = new FileWriter(tempFile,true);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			
			scanner = new Scanner(new File(filePath));
			scanner.useDelimiter("[,\n]");
			
			
			

			while(scanner.hasNext())
			{
				userName = scanner.next();
				password = scanner.next();
				if(!userName.equals(removeTerm)) {
					pw.println(userName+","+ password);
				}
			}
			scanner.close();
			pw.flush();
			pw.close();
			
			
			oldFile.delete();
			File reCreate = new File(filePath);
			newFile.renameTo(reCreate);
			
			
		} catch (IOException e) {
			System.out.println("Error Occured : ");
		}
		
		
		
	}

}
