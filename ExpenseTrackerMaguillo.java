package assignment;
import java.util.Scanner;

public class ExpenseTrackerMaguillo {
	public static void display() {
		System.out.println("==== EXPENSE TRACKER ====");
	}
	
	public static double calculateExpenses(double food, double transportation, double clothes, double other) {
		return food + transportation + clothes + other;
	}
	
	public static String budgetChecker(double totalExpense, double budget) {
		if (totalExpense > budget) {
			return "You exceeded your budget! Try saving next time.";
		}
		else if(totalExpense == budget) {
			return "You exactly met your budget. You saved nothing.";
		}
		else {
			return "Congrats! You are within your budget.";
		}
	}
	
	public static void budgetResult(double food, double transportation, double clothes, double other, double totalExpense, double budget, String status) {
		double remaining = budget - totalExpense;
		if (remaining < 0) {
			remaining = 0;
		}
		
		System.out.println("\n==== EXPENSE SUMMARY ====");
		System.out.printf("Food: %.2f", food);
		System.out.printf("\nTransportation: %.2f", transportation);
		System.out.printf("\nClothes: %.2f", clothes);
		System.out.printf("\nOthers: %.2f", other);
		System.out.printf("\nTotal Expenses: %.2f", totalExpense);
		System.out.printf("\nBudget: %.2f", budget);
		System.out.printf("\nRemaining budget: %.2f\n", remaining);
		System.out.println("\n"+ status);
	}
	
	public static double validDouble(Scanner input, String entExpense) {
		while (true) {
            System.out.println(entExpense);

            if (input.hasNextDouble()) {
                return input.nextDouble(); 
            } else {
                System.out.println("Invalid input. Please enter a number.\n");
                input.next(); 
            }
        }
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		display();
		double budget = validDouble(input, "Enter your Budget: ");
		double food = validDouble(input, "Enter your expenses for food: ");
		double transportation = validDouble(input, "Enter your expenses for transportation: ");
		double clothes = validDouble(input, "Enter your expenses for your new clothes: ");
		double other = validDouble(input, "Enter your other expenses: ");
		
		double totalExpense = calculateExpenses(food, transportation, clothes, other);
		String budgetChecker = budgetChecker(totalExpense, budget);
		budgetResult(food, transportation, clothes, other, totalExpense, budget, budgetChecker);
		
		input.close();
	}
}
