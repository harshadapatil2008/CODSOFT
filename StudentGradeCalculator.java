//CodSoft Java Internship-Task2
import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
       System.out.println("===== Student Grade Calculator =====");
        System.out.println("welcome!");
        Scanner sc = new Scanner(System.in);

        int total = 0;
        double percentage;
        char grade;

        System.out.println("Enter marks of 5 subjects:");

        for (int i = 1; i <= 5; i++) {
            System.out.print("Subject " + i + ": ");
            total += sc.nextInt();
        }

        percentage = total / 5.0;

        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 80) {
            grade = 'B';
        } else if (percentage >= 70) {
            grade = 'C';
        } else if (percentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("\nTotal Marks = " + total);
        System.out.println("Percentage = " + percentage + "%");
        System.out.println("Grade = " + grade);

        sc.close();
    }
}