import java.util.Scanner;

public class q19 {
    // WAp to printn sum of digits of a given number.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int sum=0;
        while (n!=0) {
            int ld=n%10;
            n/=10;
            sum+=ld;
        }
        System.out.println(sum);
    }
}
