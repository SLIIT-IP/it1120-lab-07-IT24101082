import java.util.Scanner;

public class IT24101082Lab7Q1A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] marks = new int[4];
        int totalMarks = 0;
        for (int i = 0; i < 4; i++) {
            System.out.print("Enter Subject Mark " + (i + 1) + ": ");
            marks[i] = input.nextInt();
            totalMarks += marks[i];
        }

        double average = totalMarks / 4.0;

        String grade;
        if (average >= 75 && average <= 100) {
            grade = "Distinction";
        } else if (average >= 50 && average <= 74) {
            grade = "Credit";
        } else {
            grade = "Fail";
        }
        System.out.printf("Average is : %.2f%n", average);
        System.out.println("Overall Grade is : " + grade);


    }
}
