import java.util.Scanner;

public class CGPACalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of courses: ");
        int numCourses = scanner.nextInt();

        double totalGradePoints = 0.0;
        double totalCreditHours = 0.0;

        for (int i = 1; i <= numCourses; i++) {
            System.out.println("Course " + i + ":");
            System.out.print("   Enter grade (A/B/C/D/F): ");
            String grade = scanner.next();
            System.out.print("   Enter credit hours: ");
            double creditHours = scanner.nextDouble();

            // Assign grade points based on the grading scale
            double gradePoints;
            switch (grade.toUpperCase()) {
                case "A":
                    gradePoints = 4.0;
                    break;
                case "B":
                    gradePoints = 3.0;
                    break;
                case "C":
                    gradePoints = 2.0;
                    break;
                case "D":
                    gradePoints = 1.0;
                    break;
                case "F":
                    gradePoints = 0.0;
                    break;
                default:
                    System.out.println("Invalid grade entered. Assuming grade points as 0.0.");
                    gradePoints = 0.0;
            }

            totalGradePoints += gradePoints * creditHours;
            totalCreditHours += creditHours;
        }

        // Calculate CGPA
        double cgpa = totalGradePoints / totalCreditHours;

        System.out.println("\nYour CGPA is: " + cgpa);

        scanner.close();
    }
}
