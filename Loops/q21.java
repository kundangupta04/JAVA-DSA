import java.util.Scanner;

public class q21 {
    // WAP to print all non-zero digit of given number

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int product = 1;
        while (n!=0) {
            int ld = n%10;
            n/=10;
            if(ld!=0){
                product*=ld;
            }
        }
        System.out.println(product);
    }
}
