import java.util.Scanner;

public class q26 {
    // Print the factorial of first 'n' numbers.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        int factorial=1;
        for(int i=1; i<=n; i++){
            factorial*=i;
            System.out.println("Factorial of "+i+" is "+factorial);
        }
    }
}
