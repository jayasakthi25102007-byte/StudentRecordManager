import java.util.ArrayList;
import java.util.Scanner;

// Student class - represents one student record
class Student {
    private int id;
    private String name;
    private int age;
    private double marks;

    public Student(int id, String name, int age, double marks) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public double getMarks() { return marks; }

    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setMarks(double marks) { this.marks = marks; }

    public String toString() {
        return "ID: " + id + " | Name: " + name + " | Age: " + age + " | Marks: " + marks;
    }
}

// Main class - menu driven program
public class Main {
    static ArrayList<Student> students = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    static int nextId = 1;

    public static void main(String[] args) {
        int choice;

        do {
            printMenu();
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1: addStudent(); break;
                case 2: viewStudents(); break;
                case 3: updateStudent(); break;
                case 4: deleteStudent(); break;
                case 5: System.out.println("Exiting program. Goodbye!"); break;
                default: System.out.println("Invalid choice. Please enter a number from 1-5.");
            }
            System.out.println();
        } while (choice != 5);

        sc.close();
    }

    static void printMenu() {
        System.out.println("===== Student Record Manager =====");