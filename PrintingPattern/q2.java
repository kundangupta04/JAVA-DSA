import java.util.Scanner;

public class q2 {
    // Print the given pattern.
    // * * * *
    // * * * *
    // * * * *
    // * * * *

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of stars or lines : ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
