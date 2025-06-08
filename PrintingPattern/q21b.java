import java.util.Scanner;
public class q21b {
    // print the given pattern.
    //       *
    //     * * *
    //   * * * * *
    // * * * * * * *
    //
    // method - 2
    // nst = no. of stars
    // nsp = no. of spaces
    // nst = 1 | nst+=2
    // nsp = n-1 | nsp--

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n  = sc.nextInt();
        int nst = 1;
        int nsp = n-1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=nsp;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=nst;j++){
                System.out.print("* ");
            }
            nsp--;
            nst+=2;
            System.out.println();
        }

    }
}
