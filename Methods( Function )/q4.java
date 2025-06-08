import java.util.Scanner;

public class q4 {
    // Combination

    // nCr = n! / r! * (n-r)!  --> combination
    // nPr = n! / (n-r)!       --> permutation

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        System.out.print("Enter r : ");
        int r = sc.nextInt();
        int fact1=1;
        int fact2=1;
        int fact3=1;
        for(int i=1;i<=n;i++){
            fact1*=i;
        }
        for(int i=1;i<=r;i++){
            fact2*=i;
        }
        for(int i=1;i<=(n-r);i++){
            fact3*=i;
        }
        int ncr = fact1/(fact2*fact3);
        System.out.println("nCr = "+ncr);
    }
}
