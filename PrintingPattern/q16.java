import java.util.Scanner;

public class q16 {
    // Print the given pattern
    // * * * * * *
    // *         *
    // *         *
    // * * * * * *
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter row And column : ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(i==1 || i==n  || j==1 || j==m){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
