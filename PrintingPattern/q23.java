import java.util.Scanner;

public class q23 {
    // print the given pattern
    // * * * * *
    //   * * * *
    //     * * *
    //       * *
    //         *
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n  =sc.nextInt();
        int nst = n;
        int nsp = 0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=nsp;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=nst;j++){
                System.out.print("* ");
            }
            nst--;
            nsp++;
            System.out.println();
        }
    }
}
