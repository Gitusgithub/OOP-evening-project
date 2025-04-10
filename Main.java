public class Main {
    
}
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