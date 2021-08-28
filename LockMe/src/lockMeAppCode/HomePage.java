package lockMeAppCode;

import java.util.Scanner;

public class HomePage {
	public static Scanner scanner = new Scanner(System.in);
	
	

	public static void homePage(String[] args) {

		
		int toDecision;
		int toDecision2;
		int toDecision3;
		System.out.println("Welcome to LockMe");

	while (true) {	
		System.out.println("----------------------------------");
		
		  System.out.println("To register press 1 : To Login Press 2 : To Exit Press 3 :"); 
		  
		  
		  toDecision = scanner.nextInt();
		 switch(toDecision) {
		 case 1 :
			 //*****************************************************************************
			 while(true) {
			 System.out.println("To register as admin press 1 : To register as user Press 2 : To return to home Press 3 :"); 
			 toDecision2 = scanner.nextInt();
			 
			 if ((toDecision2 >=1) && (toDecision2 <=3)) {
					
			
			 switch(toDecision2) {
			 case 1 :
			SignupAdmin.createSignupFileAdmin(args);
			SignupAdmin.signupAdmin(args);
			break;
			 case 2 :
				 SignupUser.signupUser(args);
				 break;
			 case 3 :
				 homePage(args);
				 break; 
			 }
			 
			 break;
			 }
			 System.out.println("Invalid Option : Try Again :");
			 }
			break;
			
			//*****************************************************************************************************
			
		 case 2 :
			 while(true) {
				 System.out.println("To login as admin press 1 : To login as user Press 2 : To return to home Press 3 :"); 
				 toDecision3 = scanner.nextInt();
				 
				 if ((toDecision3 >=1) && (toDecision3 <=3)) {
						
				
				 switch(toDecision3) {
				 case 1 :
				LoginAdmin.loginAdmin(args);
				break;
				 case 2 :
					 LoginUser.loginUser(args);
					 break;
				 case 3 :
					 homePage(args);
					 break; 
				 }
				 
				 break;
				 }
				 System.out.println("Invalid Option : Try Again :");
				 }
				break;
				
				//*******************************************************************************************************
				
		 case 3 :
			System.out.println("thankyou for using lockme!");
			System.exit(0);
			break;
			default : System.out.println("Invalid Option : Try Again :"); 
		 }
			if ((toDecision >=1) && (toDecision <=3)) {
		break;
		
		}
	}

	}

}

