import java.util.Scanner;

public class q3 {

    // take 5 input and print Least of them using built in function.
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        System.out.print("Enter 1st : ");
        int a=sc.nextInt();
        System.out.print("Enter 2nd : ");
        int b=sc.nextInt();
        System.out.print("Enter 3rd : ");
        int c=sc.nextInt();
        System.out.print("Enter 4th : ");
        int d=sc.nextInt();
        System.out.print("Enter 5th : ");
        int e=sc.nextInt();
        System.out.println("Least of them is "+Math.min(a, Math.min(b,Math.min(c,Math.min(d,e)))));

    }
}