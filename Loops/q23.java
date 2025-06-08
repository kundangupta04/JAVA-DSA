import java.util.Scanner;

public class q23 {
    // WAP to print reverse of a given number.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n =sc.nextInt();
        int reverse=0;
        while (n!=0) {
            int ld = n%10;
            n/=10;
            reverse*=10;
            reverse+=ld;
        }
        System.out.println(reverse);
    }
}
