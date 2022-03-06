import java.util.Scanner;

public class Account {

	// Class Variable
	int balance;
	int prevTransaction;
	String customerName;
	String customerID;
	
	// Class Constructor
	Account (String cname , String cid) {
		customerID = cid;
		customerName = cname;
	}
	
	//Function for Deposit
	void deposit(int amount) {
		if (amount != 0) {
			balance = balance + amount;
			prevTransaction = amount;
		}
	}
	
	//Function for withdraw
	void withdraw(int amount) {
		if (amount != 0) {
			balance = balance - amount;
			prevTransaction = -amount;
		}
	}
	
	// Function show the prev transaction
	 void getPrevTransaction() {
		 if (prevTransaction > 0) {
			 System.out.println("Deposited: " + prevTransaction);
		 } else if (prevTransaction < 0) {
			 System.out.println("WithDraw: " + Math.abs(prevTransaction));
		 } else {
			 System.out.println("No TransAction");
		 }
	 }
	 
	 // Function Show Menu
	 void showMenu() {
		 
		 char option = '\0';
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("Welcome " + customerName + "!");
		 System.out.println("Your ID is: " + customerID);
		 System.out.println("");
		 System.out.println("What would you like to do?");
		 System.out.println("");
		 System.out.println("A. Check Your Balance!");
		 System.out.println("B. Make Deposit");
		 System.out.println("C. Make WithDraw");
		 System.out.println("D. View Prev Transaction");
		 System.out.println("E. Exit");
		 
		 do {
			 System.out.println();
			 System.out.println("Enter an option:");
			 char option1 = scanner.next().charAt(0);
			 option = Character.toUpperCase(option1);
			 System.out.println();
			 
			 switch(option) {
			 	case 'A':
			 		System.out.println();
			 		System.out.println("=====================");
			 		System.out.println("Balance = $ " + balance);
			 		System.out.println("=====================");
			 		System.out.println();
			 		break;
			 		
			 	case 'B':
			 		 System.out.println("Please Enter amount to deposit: ");
			 		 int amount = scanner.nextInt();
			 		 deposit(amount);
			 		 System.out.println();
			 		 break;
			 		 
			 	case 'C':
			 		 System.out.println("Please Enter amount to withdraw: ");
			 		 int amount2 = scanner.nextInt();
			 		 withdraw(amount2);
			 		 System.out.println();
			 		 break;
			 	
			 	case 'D':
			 		
			 		System.out.println("=====================");
			 		getPrevTransaction();
			 		System.out.println("=====================");
			 		System.out.println();
			 		 
			 	case 'E':
			 		System.out.println("=====================");
			 		break;
			 		 
			 	default:
			 		System.out.println("Error: invalid option Selected.");
			 		break;
			 }
 
		 } while (option != 'E');
		 System.out.println("Thanks for use This Bank!");
		 	 
	 }
	
}
