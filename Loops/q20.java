import java.util.Scanner;

public class q20 {
    // Wap to print product of digits of a given number.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n =sc.nextInt();
        int product =1;
        while(n!=0){
            int ld = n%10;
            n/=10;
            product*=ld;
        }
        System.out.println(product);
    }
}
