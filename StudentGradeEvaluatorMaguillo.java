package assignment;
import java.util.Scanner;

public class StudentGradeEvaluatorMaguillo {
	public static double computeAve(double prelim, double midterm, double finals) {
		return (prelim + midterm + finals) / 3;
	}
	
	public static String remarks(double ave) {
		if (ave >= 90) {
			return "Excellent";
		}
		else if (ave >= 80) {
			return "Very Good";
		}
		else if (ave >= 75) {
			return "Good";
		}
		else {
			return "Failed";
		}
	}
	
	public static double validDouble(Scanner input, String entGrade) {
		double value;
		
		while (true) {
            System.out.println(entGrade);

            if (!input.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a number.");
                input.next(); 
                continue;
            }

            value = input.nextDouble();

            if (value >= 0 && value <= 100) {
                return value;
            } else {
                System.out.println("Invalid grade input.");
            }
        }
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Student Name: ");
		String name = input.nextLine();
		while (name.trim().isEmpty()) {
			System.out.println("Your name cannot be Empty");
			System.out.println("Enter Student Name: ");
			name = input.nextLine();
		}
		
		double prelim = validDouble(input, "Enter Prelim Grade: ");
        double midterm = validDouble(input, "Enter Midterm Grade: ");
        double finals = validDouble(input, "Enter Final Grade: ");
        
        double ave = computeAve(prelim, midterm, finals);
		String remark = remarks(ave);
		
		System.out.println("\nStudent Name\t: " + name);
		System.out.printf("Prelim Grade\t: %.2f\n", prelim);
		System.out.printf("Midterm Grade\t: %.2f\n", midterm);
		System.out.printf("Final Grade\t: %.2f\n", finals);
		System.out.printf("Average Grade\t: %.2f\n", ave);
		System.out.println("Student Remarks\t: " + remark);
		
		input.close();
	}
}
