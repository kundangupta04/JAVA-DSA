import java.util.Scanner;

public class q9{
    // Create an AP.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first term : ");
        int a = sc.nextInt();
        System.out.print("Enter common difference : ");
        int d = sc.nextInt();
        System.out.print("Enter no. of terms : ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            System.out.print(a+" ");
            a+=d;
        }
    }
}