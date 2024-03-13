import java.util.Scanner;
package Assignment1;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble();

        System.out.print("Enter your weight in kilograms: ");
        double weight = scanner.nextDouble();

        // Calculate BMI
        double bmi = weight / (height * height);

        // Classify BMI into categories using if-else
        String category;
        if (bmi < 18.5) {
            category = "Underweight";
        } else if (bmi >= 18.5 && bmi < 25) {
            category = "Normal weight";
        } else if (bmi >= 25 && bmi < 30) {
            category = "Overweight";
        } else{
            category = "Obese";
        }

        // Output the result
        System.out.printf("Your BMI is %.2f. You are classified as %s.\n", bmi, category);

        scanner.close();
    }
}