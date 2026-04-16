package assignment;
import java.util.Scanner;

public class EnrollmentAssessmentSystemMaguillo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String programRecommendation = "";
		String admissionResult = "";
		
		System.out.println("Enter Student Name: ");
		String name = input.nextLine();
		
		System.out.println("Enter your SHS strand (STEM, ABM, HUMSS, TVL, Others): ");
		String strand = input.nextLine().toUpperCase();
		
		System.out.println("Enter Exam Score (0-100): ");
		int eScore = input.nextInt();
		
		while (eScore < 0 || eScore > 100) {
			System.out.println("Invalid Input.");
			System.out.println("Enter Exam Score (0-100): ");
			eScore = input.nextInt();
		}
		
		System.out.println("Enter Interview Score (0-100): ");
		int iScore = input.nextInt();
		
		while (iScore < 0 || iScore > 100) {
			System.out.println("Invalid Input.");
			System.out.println("Enter Interview Score (0-100): ");
			iScore = input.nextInt();
		}

		input.nextLine();
		
		System.out.println("Enter First Screening Result (Pass/Fail): ");
		String screening = input.nextLine();
		
		while (!screening.equalsIgnoreCase("Pass") && !screening.equalsIgnoreCase("Fail")) {
		    System.out.println("Invalid Input. Enter Pass or Fail:");
		    screening = input.nextLine();
		}
		
		double finalScore = (eScore * 0.6) + (iScore * 0.4);
		
		if (screening.equalsIgnoreCase("Pass")) {
			if (finalScore >= 85) {
				admissionResult = "Admitted with Scholarship";
			}
			else if (finalScore >= 75) {
				admissionResult = "Admitted";
			}
			else if (finalScore >= 65) {
				admissionResult = "Waitlisted";
			}
			else {
				admissionResult = "Not Qualified";
			}
		}
		else {
			System.out.println("Not Qualified");
		}
		
		switch(strand.toUpperCase()) {
		case "STEM":
			programRecommendation = "BSIT/BSCS";
			break;
			
		case "ABM":
			programRecommendation = "BSBA";
			break;
			
		case "HUMSS":
			programRecommendation = "BSED / AB Communication";
			break;

		case "TVL":
			programRecommendation = "BSIT";
			break;
		
		default:
			programRecommendation = "General Program";
			break;
		}
		
		System.out.println("\n===== ENROLLMENT ASSESSMENT RESULT =====");
		System.out.printf("\nStudent Name: %s", name);
		System.out.printf("\nSHS Strand: %s", strand);
		System.out.printf("\nFinal Evaluation Score: %s", finalScore);
		System.out.printf("\nStudent Name: %s", admissionResult);
		System.out.printf("\nRecommended Program: %s", programRecommendation);
		
		input.close();
		
	}
}
