import java.util.Scanner;

public class q22 {
    //       1
    //     1 2 3
    //   1 2 3 4 5
    // 1 2 3 4 5 6 7

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n  =sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i*2-1;j++){
                System.out.print(" "+(char)(j+64));
            }
            System.out.println();
        }
    }

}
