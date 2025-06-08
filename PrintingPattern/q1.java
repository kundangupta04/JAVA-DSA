import java.util.Scanner;

public class q1 {

    // Print the given pattern
    // * * * * * 
    // * * * * * 
    // * * * * * 

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter no. of lines : ");
        int n = sc.nextInt();
        System.out.print("Enter no. of stars per line : ");
        int m = sc.nextInt();
        for(int i=1; i<=n;i++){
            for(int j=1; j<=m;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}