import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		 
		System.out.println("Welcome to the BMI calculator!");
		System.out.println("Please type 1. for Metric and Please type 2 for Standard:");
		int choice = in.nextInt();
		
		if (choice == 1) {
//			System.out.println("First choice!");
			double bmiMetric = 0;
			
			System.out.println("BMI in Metric");			
			System.out.println("Please enter weight in kilograms:");
			float weightMetric = in.nextFloat();
//			System.out.printf("Enter:%.2f\n", weightMetric);
			
			System.out.println("Please enter height in meters:");
			float heightMetric = in.nextFloat();
//			System.out.printf("Enter:%.2f\n", heightMetric);
			bmiMetric = weightMetric / (heightMetric * heightMetric);

			System.out.printf("Your BMI in Metric: %.2f\n", bmiMetric);
		}
		else if (choice == 2) {
			System.out.println("Second choice!");
			
			final int STANDARD_K = 703;
			double bmiStandard; 
//			Scanner in = new Scanner(System.in);
			System.out.println("BMI in Standard");
			System.out.println("Please enter weight in pounds:");
			float weightStandard = in.nextFloat(); 
			System.out.println("Please enter height in inches:");
			float heightStandard = in.nextFloat();
			bmiStandard = (STANDARD_K * weightStandard) / (heightStandard * heightStandard);
			System.out.printf("Your BMI in Standard: %.2f\n", bmiStandard);
		}
		// Outputting the BMI categories 
		System.out.println("\nBMI Categories:");
		System.out.println("Underweight = <18.5");
		System.out.println("Normal weight = 18.5-24.9");
		System.out.println("Overweight = 25-29.9");
		System.out.println("Obesity = BMI of 30 or greater");
				
		in.close();
	}
	// Method version of my called but couldn't grasp how to use them well in main.
	public void metric() {
		
//		double bmiMetric;
//		Scanner in = new Scanner(System.in);
//		
//		System.out.println("BMI in Metric");
//		System.out.println("Please enter weight in kilograms:");
//		double weightMetric = in.nextDouble();
//		System.out.println("Please enter height in meters squared:");
//		double heightMetric = in.nextDouble();
			
	}
	// Method version of my called but couldn't grasp how to use them well in main.
	public void standard() {
		 
//		final int STANDARD_K = 703;
//		double bmiStandard; 
//		Scanner in = new Scanner(System.in);
//		System.out.println("BMI in Standard");
//		System.out.println("Please enter weight in pounds:");
//		double weightStandard = in.nextDouble(); 
//		System.out.println("Please enter height in inches:");
//		double heightStandard = in.nextDouble();
//		bmiStandard = (STANDARD_K * weightStandard) / heightStandard;
		
	}

}