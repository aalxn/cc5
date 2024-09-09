import java.util.Scanner;

public class cgpa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int numberOfSubjects = scanner.nextInt();

        double totalGradePoints = 0.0;
        int totalCreditHours = 0;

        for (int i = 0; i < numberOfSubjects; i++) {
            System.out.print("Enter the grade for subject " + (i + 1) + ": ");
            double grade = scanner.nextDouble();

            System.out.print("Enter the credit hours for subject " + (i + 1) + ": ");
            int creditHours = scanner.nextInt();

            totalGradePoints += grade * creditHours;
            totalCreditHours += creditHours;
        }

        if (totalCreditHours > 0) {
            double cgpa = totalGradePoints / totalCreditHours;
            System.out.printf("Your CGPA is: %.2f%n", cgpa);
        } else {
            System.out.println("Error: Total credit hours must be greater than 0.");
        }

        scanner.close();
    }
}
