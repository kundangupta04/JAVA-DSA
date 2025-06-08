import java.util.Scanner;

public class q2 {

    // take 3 input and print greatest of them using built-in-function.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st num : ");
        int a=sc.nextInt();
        System.out.print("Enter 2nd num : ");
        int b=sc.nextInt();
        System.out.print("Enter 3rd num : ");
        int c=sc.nextInt();
        System.out.println("Maximum number is "+Math.max(a, Math.max(b,c)));
    }
}