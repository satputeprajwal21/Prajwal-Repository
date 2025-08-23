import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--Student Grade Calculator--");
        System.out.print("Enter student name: ");
        String name = sc.nextLine();
        System.out.print("Enter number of subjects: ");

        int subjectCount = sc.nextInt();

        double totalMarks = 0;
        double maxMarksPerSubject = 100; 
        for (int i = 1; i <= subjectCount; i++) {
            double marks;
            while (true) {
                System.out.print("Enter marks for Subject " + i + " (0 - " + maxMarksPerSubject + "): ");
                marks = sc.nextDouble();
                if (marks >= 0 && marks <= maxMarksPerSubject) {
                    break;
                } else {
                    System.out.println("Invalid marks! Please enter again.");
                }
            }
            totalMarks += marks;
        }
        double percentage = (totalMarks / (subjectCount * maxMarksPerSubject)) * 100;
        String grade;

        if (percentage >= 90) {
            grade = "A+";
        } else if (percentage >= 80) {
            grade = "A";
        } else if (percentage >= 70) {
            grade = "B";
        } else if (percentage >= 60) {
            grade = "C";
        } else if (percentage >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("\n-- Result --");
        System.out.println("Student Name : " + name);
        System.out.println("Total Marks  : " + totalMarks + "/" + (subjectCount * maxMarksPerSubject));
        System.out.printf("Percentage   : %.2f%%\n", percentage);
        System.out.println("Grade : " + grade);
        sc.close();
    }
};
