import java.util.Scanner;

public class q25 {
    // Print the factorial of a given number 'n'.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n =sc.nextInt();
        int factorial =1;
        for(int i=1;i<=n;i++){
            factorial*=i;
        }
        System.out.println("Factorial : "+factorial);
    }
}
