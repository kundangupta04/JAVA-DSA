import java.util.Scanner;

public class q11 {
    // Create GP.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first term : ");
        int a = sc.nextInt();
        System.out.print("Enter common ratio : ");
        int r = sc.nextInt();
        System.out.print("Enter no. of term : ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            System.out.print(a+" ");
            a*=r;
        }
    }
}
