import java.util.Scanner;

public class q24 {
    // WAP to print the sum of given number and its reverse.

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int reverse = 0;
        int number = n;
        while (n!=0) {
            int ld = n%10;
            n/=10;
            reverse*=10;
            reverse+=ld;
        }
        int sum = number + reverse;

        System.out.println("number : "+number);
        System.out.println("Reverse : "+reverse);
        System.out.println("sum of number and its reverse : "+sum);
    }
}
