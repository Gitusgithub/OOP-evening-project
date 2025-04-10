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