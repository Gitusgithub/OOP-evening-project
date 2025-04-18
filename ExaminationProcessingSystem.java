
import java.util.Scanner;
import java.time.LocalDate;

class Student {
    String name;
    String id;
    int[] marks = new int[5];
    double average;
    String grade;
    String comment;
    Student(String name, String id) {
        this.name = name;
        this.id = id;
    }
}

public class ExaminationProcessingSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Student[] students = new Student[10]; 
         // Reading of the details of students
         for (int i = 0; i < 10; i++) {
            System.out.println("Enter student " + (i + 1) + " name:");
            String name = input.nextLine();

            System.out.println("Enter student " + (i + 1) + " ID:");
            String id = input.nextLine();

            students[i] = new Student(name, id);
            // Getting of the marks
            for (int j = 0; j < 5; j++) {
                System.out.println("Enter marks for subject " + (j + 1) + ":");
                students[i].marks[j] = input.nextInt();
            }
            input.nextLine(); 
            // Calculating average marks and grade of teh students
            calculate(students[i]);
            // Displaying and showing of the report
            showReport(students[i]);
        }
        input.close();
    }
    //Using strathmore grading standards
    public static void calculate(Student s) {
        int sum = 0;
        for (int i = 0; i < s.marks.length; i++) {
            sum += s.marks[i];
        }
        s.average = sum / 5.0;

        if (s.average >= 70) {
            s.grade = "A";
            s.comment = "Excellent";
        } else if (s.average >= 60) {
            s.grade = "B";
            s.comment = "Good";
        } else if (s.average >= 50) {
            s.grade = "C";
            s.comment = "Average";
        } else if (s.average >= 40) {
            s.grade = "D";
            s.comment = "Below Average";
        } else {
            s.grade = "F";
            s.comment = "Poor";
        }
    }
    public static void showReport(Student s) {
        System.out.println("\n--- Report ---");
        System.out.println("Name: " + s.name);
        System.out.println("ID: " + s.id);

        for (int i = 0; i < s.marks.length; i++) {
            System.out.println("Subject " + (i + 1) + ": " + s.marks[i]);
        }
        System.out.println("Average: " + s.average);
        System.out.println("Grade: " + s.grade);
        System.out.println("Comment: " + s.comment);
        System.out.println("Date: " + LocalDate.now());
        System.out.println("--------------------\n");
    }
}