import java.util.Scanner;

public class q22 {
    // WAP to print sum of all the even digits of a given number.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int sum = 0;
        while (n!=0) {
            int ld = n%10;
            n/=10;
            if(ld%2==0){
                sum+=ld;
            }

        }
        System.out.println(sum);
    }
}
