import java.util.Scanner;

public class fun1 {
    // student name
    // student age
    // student class
    // student grade

    public static void student(String name, int age, String section, String grade) {
        System.out.println("Hello sir, this student name is "+name+" of section "+section+" . His previous grade is "+grade+" .He is "+age+" years old.");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name : ");
        String name =sc.next();

        System.out.print("Enter Age : ");
        int age = sc.nextInt();

        System.out.print("Enter section : ");
        String section = sc.next();

        System.out.print("Enter grade : ");
        String grade = sc.next();

        student(name, age, section, grade);
    }
}
