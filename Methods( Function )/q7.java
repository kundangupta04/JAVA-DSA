import java.util.Scanner;

public class q7 {
    // Swap 2 numbers

    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        System.out.print("Enter first number : ");
        int n =sc.nextInt();
        System.out.print("Enter second number : ");
        int m =sc.nextInt();

        // // 1st method
        // int temp =n;
        // n=m;
        // m=temp;

        // 2nd method
        n=n+m;
        m=n-m;
        n=n-m;
        System.out.println("First num : "+n);
        System.out.println("Second num : "+m);

    }
}
