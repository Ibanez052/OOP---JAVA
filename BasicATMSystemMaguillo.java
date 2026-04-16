package assignment;
import java.util.Scanner;

public class BasicATMSystemMaguillo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double balance = 5000;
		double amount;
		int choice;
		
		do {
			System.out.println("\n===== ATM MENU =====");
			System.out.println("1. Check Balance");
			System.out.println("2. Deposit");
			System.out.println("3. Withdraw");
			System.out.println("4. Exit");
			System.out.println("\nSelect option: ");
			choice = input.nextInt();
			
			switch (choice) {
			case 1:
				System.out.printf("\nCurrent Balance: P %.2f\n", balance);
				break;
				
			case 2:
				System.out.println("Enter amount to Deposit: ");
				amount = input.nextDouble();
				balance += amount;
				System.out.printf("\nDeposited P %.2f Successfully\n", amount);
				break;
			
			case 3:
				System.out.println("Enter amount to Withdraw: ");
				amount = input.nextDouble();
				
				if (amount > 2000) {
					System.out.println("\nMaximum Withdrawal Amount is P 2000.00\n");
				}
				else if (amount > balance) {
					System.out.println("\nInusfficient Balance\n");
				}
				else {
					balance -= amount;
					System.out.printf("\nWithdrew P %.2f Successfully\n", amount);
				}
				break;
			case 4:
				System.out.println("\nThank you for using the ATM Machine");
				break;
			
			default:
				System.out.println("\nInvalid Option\n");
			}
		}while(choice != 4);
		input.close();
	}

}
